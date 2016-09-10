package tri.example.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by mikocok on 04/09/2016.
 */
@Entity
@Table(name = "tbl_buku")
public class Buku implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_buku")
    private int idBuku;

    @Column(nullable = false,name = "nama_buku")
    @NotEmpty
    @Size(min = 3, max = 200)
    private String namaBuku;

    @NotEmpty
    private String pengarang;

    @Column(nullable = false,name = "tahun_terbit")
    @Size(min = 4, max = 4)
    private String tahunTerbit;


    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
}
