package com.notes.ui.details

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.notes.App
import com.notes.databinding.FragmentNoteDetailsBinding
import com.notes.ui._base.*
import javax.inject.Inject
import javax.inject.Named

class NoteDetailsFragment : ViewBindingFragment<FragmentNoteDetailsBinding>(
    FragmentNoteDetailsBinding::inflate
) {

    @Inject
    @Named("Detail")
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<NoteDetailsViewModel> { viewModelFactory }

    private val id by lazy(LazyThreadSafetyMode.NONE){
        requireArguments().getLong(ARG_ID)
    }

    private val title by lazy(LazyThreadSafetyMode.NONE){
        requireArguments().getString(ARG_TITLE).orEmpty()
    }

    private val description by lazy(LazyThreadSafetyMode.NONE){
        requireArguments().getString(ARG_DESCRIPTION).orEmpty()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.noteDetailComponent().build().inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewBindingCreated(
        viewBinding: FragmentNoteDetailsBinding,
        savedInstanceState: Bundle?
    ) {
        super.onViewBindingCreated(viewBinding, savedInstanceState)

        with(viewBinding){

            toolbar.setNavigationOnClickListener {
                onBackPressed()
            }

            changeTitle.setText(title)
            changeDescription.setText(description)

            btnUpdateData.setOnClickListener {
                viewModel.updateNote(id, changeTitle.text.toString(), changeDescription.text.toString())
                onBackPressed()
            }
        }
    }

    private fun onBackPressed(){
        findImplementationOrThrow<FragmentNavigator>().onBackPressed()
    }

    companion object{

        private const val ARG_ID = "ARG_ID"
        private const val ARG_TITLE = "ARG_TITLE"
        private const val ARG_DESCRIPTION = "ARG_DESCRIPTION"

        fun newInstance(id: Long, title: String, description: String) =
            NoteDetailsFragment().withArgs {
                putLong(ARG_ID, id)
                putString(ARG_TITLE, title)
                putString(ARG_DESCRIPTION, description)
            }
    }
}