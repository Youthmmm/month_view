package com.majianguo.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.month_view.entity.GreendaoEntity;
import com.example.month_view.GreenDao;

import com.majianguo.greendao.GreendaoEntityDao;
import com.majianguo.greendao.GreenDaoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig greendaoEntityDaoConfig;
    private final DaoConfig greenDaoDaoConfig;

    private final GreendaoEntityDao greendaoEntityDao;
    private final GreenDaoDao greenDaoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        greendaoEntityDaoConfig = daoConfigMap.get(GreendaoEntityDao.class).clone();
        greendaoEntityDaoConfig.initIdentityScope(type);

        greenDaoDaoConfig = daoConfigMap.get(GreenDaoDao.class).clone();
        greenDaoDaoConfig.initIdentityScope(type);

        greendaoEntityDao = new GreendaoEntityDao(greendaoEntityDaoConfig, this);
        greenDaoDao = new GreenDaoDao(greenDaoDaoConfig, this);

        registerDao(GreendaoEntity.class, greendaoEntityDao);
        registerDao(GreenDao.class, greenDaoDao);
    }
    
    public void clear() {
        greendaoEntityDaoConfig.clearIdentityScope();
        greenDaoDaoConfig.clearIdentityScope();
    }

    public GreendaoEntityDao getGreendaoEntityDao() {
        return greendaoEntityDao;
    }

    public GreenDaoDao getGreenDaoDao() {
        return greenDaoDao;
    }

}