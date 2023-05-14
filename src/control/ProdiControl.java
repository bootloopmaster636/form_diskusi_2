package control;

import java.util.List;

import dao.ProdiDAO;
import entity.Prodi;

public class ProdiControl {
    private final ProdiDAO pDao = new ProdiDAO();

    public void insertDataProdi(Prodi p) {
        pDao.insertProdi(p);
    }

    public String showDataProdi() {

        List<Prodi> dataProdi = pDao.showProdi();

        String prodiString = "";

        for (int i = 0; i < dataProdi.size(); i++) {
            prodiString = prodiString + dataProdi.get(i).getKodeProdi() + " || "
                    + dataProdi.get(i).getNamaProdi() + "\n";
        }

        return prodiString;
    }

    public void updateDataProdi(Prodi p) {
        pDao.updateProdi(p);
    }

    public void deleteDataProdi(String kodeProdi) {
        pDao.deleteProdi(kodeProdi);
    }

    public Prodi searchProdi(String kodeProdi) {
        Prodi p = pDao.searchProdi(kodeProdi);
        return p;
    }
    public List<Prodi> showListProdi() {
        List<Prodi> dataProdi = pDao.showProdi();
        return dataProdi;
    }
}