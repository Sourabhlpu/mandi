package sourabh.pal.findfalcone.common.data.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiVehicles(
 val vehicles: List<ApiVehicle>?
)