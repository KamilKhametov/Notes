package com.notes.ui.add

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.notes.App
import com.notes.databinding.FragmentNoteAddBinding
import com.notes.ui._base.FragmentNavigator
import com.notes.ui._base.ViewBindingFragment
import com.notes.ui._base.findImplementationOrThrow
import javax.inject.Inject
import javax.inject.Named

class NoteAddFragment : ViewBindingFragment<FragmentNoteAddBinding>(
    FragmentNoteAddBinding::inflate
) {

    @Inject
    @Named("Add")
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<NoteAddViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.noteAddComponent().build().inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewBindingCreated(
        viewBinding: FragmentNoteAddBinding,
        savedInstanceState: Bundle?,
    ) {
        super.onViewBindingCreated(viewBinding, savedInstanceState)

        with(viewBinding) {

            toolbar.setNavigationOnClickListener {
                onBackPressed()
            }

            sendData.setOnClickListener {
                val title = inputTitle.text.toString()
                val description = inputDescription.text.toString()

                if (title.isEmpty() || description.isEmpty()) {
                    Toast.makeText(requireContext(), "Заполните поля", Toast.LENGTH_SHORT).show()
                } else {
                    viewModel.addNote(title, description)
                    onBackPressed()
                }
            }
        }
    }

    private fun onBackPressed() {
        findImplementationOrThrow<FragmentNavigator>().onBackPressed()
    }
}