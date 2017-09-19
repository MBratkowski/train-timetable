package io.bratexsoft.data.remote

import com.google.firebase.database.*
import io.bratexsoft.data.remote.entity.StationRemoteData
import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.domain.gateway.StationGateway
import io.bratexsoft.domain.usecase.base.CallbackData

class StationRemoteRepository : StationGateway {

    private val databaseReference: DatabaseReference = FirebaseDatabase.getInstance().getReference("stations")

    override fun getStationList(callbackData: CallbackData<List<StationDefinition>>) {
        val menuListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot?) {
                val listOfStations: ArrayList<StationDefinition> = ArrayList()
                dataSnapshot?.children?.forEach {
                    listOfStations.add(StationRemoteData(it.value as String, Integer.valueOf(it.key)))
                }
                callbackData.onSuccess(listOfStations)
            }

            override fun onCancelled(databaseError: DatabaseError?) {
                callbackData.onError(databaseError!!.message)
            }
        }
        databaseReference.addListenerForSingleValueEvent(menuListener)
    }
}