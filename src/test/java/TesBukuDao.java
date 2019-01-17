import com.gedharizka.training.hibernate.Dao.BukuDao;
import com.gedharizka.training.hibernate.Dao.KategoriBukuDao;
import com.gedharizka.training.hibernate.configuration.SessionFactoryUtil;
import com.gedharizka.training.hibernate.entity.Buku;
import com.gedharizka.training.hibernate.entity.KategoriBuku;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
@Slf4j
public class TesBukuDao extends TestCase {

    private SessionFactory sessionFactory;

    @Override
    protected void setUp() throws Exception {
        SessionFactoryUtil util = new SessionFactoryUtil();
        this.sessionFactory = util.getSessionFactory();
    }

    @Test
    public void testBukuDao() {
        Session session = sessionFactory.openSession();
//        KategoriBukuDao kategoryDao = KategoriBukuDao(session);
//        BukuDao dao = new BukuDao(session);
//        session.beginTransaction();
//
//        KategoriBuku it = new KategoriBuku("Ilmu Komputer", null);
//        KategoriBuku matematika = new KategoriBuku("Matematika", null);
//
//        kategoryDao.save(Arrays.asList(it,matematika));
//        kategoryDao.save(matematika);
//
//        List<KategoriBuku>listKategoriBuku = kategoryDao.findAll();
//
//        Buku pemograman = new Buku(
//                "2344-1234324",
//                "Algoritma Pemograman",
//                "Dimas Maryanto",
//                2019,
//                "INformatika");
//
//        log.info("before save: {}", pemograman.toString());
//        pemograman = dao.save(pemograman);
//
//        log.info("after save: {}", pemograman.toString());
//        session.getTransaction().commit();
////        Aman
//        assertNotNull(pemograman.getId());
//        assertEquals("nama pengarang", pemograman.getNamaPengarang(), "Dimas Maryanto");
//
//        assertEquals("daftar kategory",
//                pemograman.getList().size(),2
//                );
////      Aman
//        List<Buku> daftarBuku = dao.findAll();
//        assertEquals("jumlah daftar buku bertambah", daftarBuku.size(), 1);
////========================
//        session.beginTransaction();
//        Buku bukuPemograman = dao.findById(pemograman.getId());
//        bukuPemograman.setNamaPengarang("Mako");
//        dao.update(bukuPemograman);
////========================
//        bukuPemograman = dao.findById(bukuPemograman.getId());
//        log.info("after update: {}", bukuPemograman);
////untuk mengecek
//        assertSame("nama pengarang sama dengan rega",
//                bukuPemograman.getNamaPengarang(),
//                "Mako");
//
//        session.getTransaction().commit();
//        session.close();
    }

}
