package apap.ti.silogistik2106701892.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apap.ti.silogistik2106701892.model.Gudang;
import apap.ti.silogistik2106701892.repository.GudangDb;

@Service
public class GudangServiceImpl implements GudangService {
    @Autowired
    GudangDb gudangDb;

    @Override
    public void saveGudang(Gudang gudang) {
        gudangDb.save(gudang);
    }

    @Override
    public List<Gudang> getAllGudang() {
        return gudangDb.findAll();
    }

    @Override
    public Gudang getGudangById(Long id) {
        for (Gudang gudang : getAllGudang()){
            if (gudang.getIdGudang().equals(id)){
                return gudang;
            }
        }
        return null;
    }
}
