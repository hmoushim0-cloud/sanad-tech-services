package sa.factory.sanadtechservices.model

import kotlinx.serialization.Serializable

@Serializable
data class SanadTechItem(
    val id: String,
    val title: String,
    val description: String,
    val priceSar: String,
    val badge: String = "معتمد"
)

@Serializable
data class SanadTechOrder(
    val requestId: String,
    val items: List<SanadTechItem>,
    val status: String = "ACTIVE"
)
