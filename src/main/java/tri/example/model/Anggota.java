package tri.example.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mikocok on 04/09/2016.
 */
@Entity
@Table(name = "tbl_anggota")
public class Anggota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_anggota")
    private int idAnggota;

    @Column(nullable = false,name = "nama_anggota")
    @NotEmpty
    @Size(min = 3, max = 100)
    private String namaAnggota;

    @Column(nullable = false,length = 200, name = "alamat_anggota")
    private String alamatAnggota;

    @Column(name = "tgl_lahir", nullable = false)
    @Temporal(TemporalType.DATE)
    @Past
    private Date tglLahir;

    @Column(nullable = false, length = 10, name = "jenis_kelamin")
    private String jenisKelamin;

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getAlamatAnggota() {
        return alamatAnggota;
    }

    public void setAlamatAnggota(String alamatAnggota) {
        this.alamatAnggota = alamatAnggota;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}

