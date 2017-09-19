package io.bratexsoft.data.remote.client

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class FirebaseDataClient {
    val databaseReference: DatabaseReference = FirebaseDatabase.getInstance().getReference("stations")
}