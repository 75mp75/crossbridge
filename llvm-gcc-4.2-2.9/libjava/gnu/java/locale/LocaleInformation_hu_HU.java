/* LocaleInformation_hu_HU.java
   Copyright (C) 2002 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_hu_HU extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = "";
  static final String numberFormat = "#.###";
  static final String percentFormat = "#%";
  static final String[] weekdays = { null, "VAS\u00C1RNAP", "H\u00C9TF\u0150", "KEDD", "SZERDA", "CS\u00DCT\u00D6RT\u00D6K", "P\u00C9NTEK", "SZOMBAT" };

  static final String[] shortWeekdays = { null, "V", "H", "K", "SZE", "CS", "P", "SZO" };

  static final String[] shortMonths = { "JAN", "FEB", "M\u00C1R", "\u00C1PR", "M\u00C1J", "J\u00DAN", "J\u00DAL", "AUG", "SZE", "OKT", "NOV", "DEC", null };

  static final String[] months = { "JANU\u00C1R", "FEBRU\u00C1R", "M\u00C1RCIUS", "\u00C1PRILIS", "M\u00C1JUS", "J\u00DANIUS", "J\u00DALIUS", "AUGUSZTUS", "SZEPTEMBER", "OKT\u00D3BER", "NOVEMBER", "DECEMBER", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "yyyy-MM-dd";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "FT";
  static final String intlCurrencySymbol = "HUF";
  static final String currencyFormat = "$ #,###,##0.00;-$ #,###,##0.00";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}