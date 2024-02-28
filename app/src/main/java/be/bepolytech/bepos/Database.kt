package be.bepolytech.bepos

import com.google.firebase.ktx.Firebase
import com.google.firebase.firestore.ktx.firestore

abstract class Database {

    val db = Firebase.firestore
}