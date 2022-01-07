package lat1.shibaaazmi.tugas_akhir;

public class model_data {
    private String nama;
    private String email;
    private String alamat;
    private String key;

    public model_data(String nama, String email, String alamat) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}
