package apap.ti.silogistik2106701892.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apap.ti.silogistik2106701892.model.Karyawan;
import apap.ti.silogistik2106701892.repository.KaryawanDb;

@Service
public class KaryawanServiceImpl implements KaryawanService{
    @Autowired
    KaryawanDb karyawanDb;

    @Override
    public void saveKaryawan(Karyawan karyawan) {
        karyawanDb.save(karyawan);
    }

    @Override
    public List<Karyawan> getAllKaryawan() {
        return karyawanDb.findAll();
    }
}
