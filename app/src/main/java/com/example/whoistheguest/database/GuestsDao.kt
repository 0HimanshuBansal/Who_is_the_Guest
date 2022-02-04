package com.example.whoistheguest.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GuestsDao {
    @Insert
    fun insertGuest(guestsEntity: GuestsEntity)

    @Query("SELECT * FROM guests")
    fun getAllGuests(): List<GuestsEntity>

    //Update Guest Info
    @Query(
        "UPDATE guests SET guest_name= :guestName ," +
                "guest_address =:address " +
                "WHERE guest_phone = :phone"
    )
    fun updateData(guestName: String?, phone: String?, address: String?, key: Int)

    //Get Guest
    @Query("SELECT * FROM guests WHERE guest_phone = :guestPhone")
    fun getGuestById(guestPhone: String): GuestsEntity

    @Delete
    fun deleteGuest(guestsEntity: GuestsEntity)
}