package com.hxkj.system.model;

import com.hxkj.system.model.base.BaseSysMenu;
import com.jfinal.kit.StrKit;
import jodd.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated by JFinal.
 * 菜单
 */
@SuppressWarnings("serial")
public class SysMenu extends BaseSysMenu<SysMenu> {
    public static final SysMenu dao = new SysMenu().dao();

    public List<SysMenu> findAll() {
        String sql = "select * from sys_menu order by  sort asc";
        return find(sql);
    }

    public List<SysMenu> getChildren() {
        return get("children");
    }

    /**
     * 根据  用户角色 从 角色菜单中间表  和  菜单表，查询 用户角色拥有的不重复的 菜单
     * @param roleIds
     * @return
     */
    public List<SysMenu> findByRoleIds(String roleIds) {
        List<SysMenu> result = new ArrayList<SysMenu>();
        if(StrKit.notBlank(roleIds)) {
            result = find("select distinct b.* from sys_role_menu a join sys_menu b on a.menu_id=b.id where a.role_id in(" + roleIds + ")");
        }
        return result;
    }
}
