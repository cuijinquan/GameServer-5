package info.xiaomo.server.dataConfig;

import info.xiaomo.gameCore.config.IConfigDataManager;
import info.xiaomo.gameCore.config.excel.ExcelConfigDataManager;

import java.util.List;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/8/24 12:51
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class ConfigDataManager implements IConfigDataManager {
    private static ConfigDataManager ourInstance = new ConfigDataManager();
    private ExcelConfigDataManager manager = new ExcelConfigDataManager();

    public static ConfigDataManager getInstance() {
        return ourInstance;
    }

    private ConfigDataManager() {
    }

    @Override
    public <T> T getConfig(Class<T> clz, Object... primaryKey) {
        return manager.getConfig(clz, primaryKey);
    }

    @Override
    public <T> List<T> getConfigs(Class<T> clz) {
        return manager.getConfigs(clz);
    }

    @Override
    public <T> T getConfigCache(Class<T> clz) {
        return manager.getConfigCache(clz);
    }

    @Override
    public void init() throws Exception {
        manager.init();
    }


}
