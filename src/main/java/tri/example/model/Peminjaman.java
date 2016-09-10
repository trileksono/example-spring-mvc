package tri.example.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mikocok on 04/09/2016.
 */
@Entity
@Table(name = "peminjaman")
public class Peminjaman implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_buku")
    private Buku buku;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_anggota")
    private Anggota anggota;

    @Column(name = "tgl_pinjam")
    @Temporal(TemporalType.DATE)
    private Date tglPinjam;

    @Column(name = "tgl_kembali")
    @Temporal(TemporalType.DATE)
    private Date tglKembali;

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }
}