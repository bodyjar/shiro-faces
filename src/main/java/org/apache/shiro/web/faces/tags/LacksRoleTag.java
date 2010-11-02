package org.apache.shiro.web.faces.tags;

import com.sun.facelets.tag.TagConfig;

/**
 * @author Deluan Quintao
 */
public class LacksRoleTag extends PermissionTag {

    // TODO - complete JavaDoc

    public LacksRoleTag(TagConfig config) {
        super(config);
    }

    @Override
    protected boolean showTagBody(String roleName) {
        return getSubject() != null && getSubject().hasRole(roleName);
    }

}