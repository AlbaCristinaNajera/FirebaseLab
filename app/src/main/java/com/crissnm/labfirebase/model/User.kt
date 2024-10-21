package com.crissnm.labfirebase.model

data class User(
    val email: String,
    val userId: String,
    val name: String

){
    fun toMap(): Map<String, Any>{
        return mapOf(
            "email" to email,
            "password" to userId,
            "name" to name
        )
    }

}
