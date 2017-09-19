package io.bratexsoft.traintimetable.di.module

import dagger.Module

@Module
class RemoteDataModule {

}

/*@Provides
@Singleton
fun provideFirebase(): DatabaseReference {
    return FirebaseDatabase.getInstance().getReference("stations")
}

@Provides
@Singleton
fun provideFirebaseDataClient(databaseReference: DatabaseReference): FirebaseDataClient {
    return FirebaseDataClient(databaseReference)
}*/
