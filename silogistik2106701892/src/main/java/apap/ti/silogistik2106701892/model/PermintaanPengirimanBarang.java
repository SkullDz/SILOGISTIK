package apap.ti.silogistik2106701892.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permintaan_pengiriman_barang")
public class PermintaanPengirimanBarang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermintaanPengirimanBarang;

    @Size(max = 20)
    @ManyToOne
    @JoinColumn(name = "id_permintaan_pengiriman", referencedColumnName = "idPermintaanPengiriman")
    private PermintaanPengiriman permintaanPengiriman;

    @ManyToOne
    @JoinColumn(name = "sku_barang", referencedColumnName = "sku")
    private Barang barang;

    @NotNull
    @Column(name = "kuantitas_pesanan", nullable = false)
    private Integer kuantitasPesanan;

}
