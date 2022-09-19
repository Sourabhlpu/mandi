package sourabh.pal.mandi.find.domain.usecases

import sourabh.pal.mandi.common.domain.repositories.MandiRepository
import javax.inject.Inject

class GetPlanets @Inject constructor(private val repository: MandiRepository){
    suspend  operator fun invoke() = repository.getAllPlanets()
}