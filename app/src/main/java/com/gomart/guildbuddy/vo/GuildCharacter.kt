package com.gomart.guildbuddy.vo

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *   Created by gmartins on 2020-08-29
 *   Description:
 */
@Entity
data class GuildCharacter(
        @PrimaryKey
        val id: Int,
        val name: String
)