/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.List;
import dao.MahasiswaDAO;
import entity.Mahasiswa;
import table.TableMahasiswa;
/**
 *
 * @author tkg
 */
public class MahasiswaControl {
    private MahasiswaDAO mDao = new MahasiswaDAO();
    
    public TableMahasiswa showMahasiswa(String query) {
        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa(query);
        TableMahasiswa tableMahasiswa = new TableMahasiswa(dataMahasiswa);

        return tableMahasiswa;
    }

    public void insertDataMahasiswa(Mahasiswa m) {
        mDao.insertMahasiswa(m);
    }

    public void updateDataMahasiswa(Mahasiswa m) {
        mDao.updateMahasiswa(m);
    }

    public void deleteDataMahasiswa(String npm) {
        mDao.deleteMahasiswa(npm);
    }

    public String searchMahasiswa(String npm) {
        Mahasiswa m = mDao.SearchMahasiswa(npm);
        String result = "";
        if (m != null) {
            result = m.getNamaMahasiswa();
        }
        return result;
    }
}