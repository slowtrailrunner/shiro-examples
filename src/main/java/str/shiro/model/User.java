/**
 * 
 */
package str.shiro.model;

import str.shiro.enums.Status;

/**
 * @author Jason Holmberg
 *
 */
public interface User {
  String getFirstname();
  String getLastname();
  String getUsername();
  byte[] getPassword();
  Status getStatus();
}
