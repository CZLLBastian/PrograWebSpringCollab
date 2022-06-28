package pe.edu.upc.fullhouse.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.fullhouse.entities.Room;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer> {
	
	//reporte
		@Query(value="Select r.descp_room, d.nom_district, r.adress,v.pre_habitacion from room r join district d on d.id_district=r.id_district inner join aviso v on v.id_habitacion=r.id_room group by r.descp_room, d.nom_district,r.adress,v.pre_habitacion order by 4 asc", nativeQuery=true)
		public List<String[]>roomPrice();
}
