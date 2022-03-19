package com.notes.ui.list

import android.os.Bundle
import android.widget.LinearLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.notes.App
import com.notes.data.model.NoteListItem
import com.notes.databinding.FragmentNoteListBinding
import com.notes.ui._base.FragmentNavigator
import com.notes.ui._base.ViewBindingFragment
import com.notes.ui._base.findImplementationOrThrow
import com.notes.ui.add.NoteAddFragment
import com.notes.ui.details.NoteDetailsFragment
import java.util.*
import javax.inject.Inject
import javax.inject.Named

class NoteListFragment : ViewBindingFragment<FragmentNoteListBinding>(
    FragmentNoteListBinding::inflate
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.noteListComponent().build().inject(this)
        super.onCreate(savedInstanceState)
    }

    @Inject
    @Named("List")
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<NoteListViewModel> { viewModelFactory }

    private val noteListAdapter by lazy(LazyThreadSafetyMode.NONE) {
        NoteListAdapter(
            onDetailClick = { id, title, description ->
                navigateDetailNote(id, title, description)
            },
            onDeleteClick = { id ->
                deleteNote(id)
            }
        )
    }

    override fun onResume() {
        viewModel.getNotes()
        super.onResume()
    }

    override fun onViewBindingCreated(
        viewBinding: FragmentNoteListBinding,
        savedInstanceState: Bundle?,
    ) {
        super.onViewBindingCreated(viewBinding, savedInstanceState)

        with(viewBinding) {

            list.apply {
                adapter = noteListAdapter
                addItemDecoration(
                    DividerItemDecoration(
                        requireContext(),
                        LinearLayout.VERTICAL
                    )
                )
            }

            createNoteButton.setOnClickListener {
                findImplementationOrThrow<FragmentNavigator>().navigateTo(
                    NoteAddFragment()
                )
            }

            viewModel.notes.observe(viewLifecycleOwner, {

                val sortedList = it?.sortedBy { it.modifiedAt }

                noteListAdapter.setItems(sortedList?.reversed() ?: emptyList())
            })
        }
    }

    private fun navigateDetailNote(id: Long, title: String, description: String) {
        findImplementationOrThrow<FragmentNavigator>().navigateTo(
            NoteDetailsFragment.newInstance(id, title, description)
        )
    }

    private fun deleteNote(id: Long) {
        viewModel.deleteNote(id)
        viewModel.getNotes()
    }
}