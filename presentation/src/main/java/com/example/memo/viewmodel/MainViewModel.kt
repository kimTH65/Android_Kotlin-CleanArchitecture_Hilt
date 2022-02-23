package com.example.memo.viewmodel

import androidx.lifecycle.*
import com.example.domain.model.Dto
import com.example.domain.usecase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
        private val useCase: UseCase
    ) : ViewModel() {
    val movieRepository: LiveData<List<Dto>> get()= _movieRepository
    private val _movieRepository = MutableLiveData<List<Dto>>()
    //("0a248ab8367333fba08f7bfade19fce4","targetDt")

    fun getMovie(key: String,targetDt: String)=
        viewModelScope.launch{
            val result = useCase.getMovie(key,targetDt)

            _movieRepository.postValue(result!!)
        }

}
