/******************************************************************************
 * Copyright (c) 2002 - 2014 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *****************************************************************************/

package dynamicCG;

public class ExtraClass {
  private final Object x;
  
  public ExtraClass(Object x) {
    this.x = x;
  }

  public ExtraClass() {
    this(null);
  }

  private static String printObject() {
    return " (object)";
  }
  
  private static String getName(Object x) {
    return x.toString() + printObject();
  }
  
  @Override
  public String toString() {
     return getName(x);
   }
}
