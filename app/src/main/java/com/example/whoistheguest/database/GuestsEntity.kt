package com.example.whoistheguest.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "guests")
data class GuestsEntity(
    @PrimaryKey val guest_id: String,
    @ColumnInfo(name = "guest_name") val guestName: String,
    @ColumnInfo(name = "guest_provider") val guestProvider: String,
    @ColumnInfo(name = "guest_phone") val guestPhone: String,
    @ColumnInfo(name = "guest_address") val guestAddress: String,
    @ColumnInfo(name = "host_address") val HostAddress: String,
    @ColumnInfo(name = "host_name") val HostName: String,
    @ColumnInfo(name = "guest_vaccinated") val guestIsVaccinated: Boolean,
    @ColumnInfo(name = "guest_vehicle") val guestHaveVehicle: Boolean,
    @ColumnInfo(name = "guest_time") val time: String
)