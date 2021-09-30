package lu.ptc.rentcarapi.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class VinGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        final String prefix = "PTC";
        int rand = (int) ((Math.random() * (99999 - 11111)) + 11111);
        return prefix + rand;
    }
}
