package com.example.LamTranKimYen_2011061354.repository;
import com.example.LamTranKimYen_2011061354.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan, Long>{
}
