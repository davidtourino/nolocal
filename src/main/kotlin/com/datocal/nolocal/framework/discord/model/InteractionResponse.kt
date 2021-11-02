package com.datocal.nolocal.framework.discord.model

data class InteractionResponse(
    val type: Int,
    val data: InteractionResponseData?
)

data class InteractionResponseData(
    val content: String?,
)
