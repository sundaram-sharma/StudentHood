package com.example.studenthood.di

import com.example.instagramclone.domain.use_cases.*
import com.example.studenthood.domain.repository.AuthenticationRepository
import com.example.studenthood.viewModel.AuthenticationRepositoryImpl
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//annotation are for dagger

@Module
@InstallIn(SingletonComponent::class) //
object StudentHoodDiModule {
    //injected singleton classes through dependency injection

    @Singleton //singleton classes calling
    @Provides //this will provide the dagger
    fun provideFirebaseAuthentication(): FirebaseAuth { //providing this funtion FirebaseAuth
        return FirebaseAuth.getInstance() //returing the instance of FirebaseAuth class
    }

    @Singleton
    @Provides
    fun provideFirebaseFirestore():FirebaseFirestore{
        return FirebaseFirestore.getInstance()
    }

    @Singleton
    @Provides
    fun provideFirebaseStorage():FirebaseStorage{
        return FirebaseStorage.getInstance()
    }

    @Singleton
    @Provides
    fun provideAuthenticationRepository(auth:FirebaseAuth, firestore: FirebaseFirestore): AuthenticationRepository {
        return AuthenticationRepositoryImpl(auth=auth,firestore=firestore)
    }

    @Singleton
    @Provides
    fun provideAuthUseCases(repository: AuthenticationRepository)=AuthenticationUseCase(
        isUserAuthenticated = IsUserAuthenticated(repository = repository),
        firebaseAuthState = FirebaseAuthState(repository = repository),
        firebaseSignIn = FirebaseSignIn(repository=repository),
        firebaseSignOut = FirebaseSignOut(repository=repository),
        firebaseSignUp = FirebaseSignUp(repository=repository)
    )


}