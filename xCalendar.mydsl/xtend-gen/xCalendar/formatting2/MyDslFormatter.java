/**
 * generated by Xtext 2.22.0
 */
package xCalendar.formatting2;

import com.google.inject.Inject;
import iCal.Calendar;
import iCal.Component;
import iCal.iCalFormat;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import xCalendar.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final iCalFormat iCalFormat, @Extension final IFormattableDocument document) {
    document.<Calendar>format(iCalFormat.getCalendar());
  }
  
  protected void _format(final Calendar calendar, @Extension final IFormattableDocument document) {
    EList<Component> _component = calendar.getComponent();
    for (final Component component : _component) {
      document.<Component>format(component);
    }
  }
  
  public void format(final Object calendar, final IFormattableDocument document) {
    if (calendar instanceof XtextResource) {
      _format((XtextResource)calendar, document);
      return;
    } else if (calendar instanceof Calendar) {
      _format((Calendar)calendar, document);
      return;
    } else if (calendar instanceof iCalFormat) {
      _format((iCalFormat)calendar, document);
      return;
    } else if (calendar instanceof EObject) {
      _format((EObject)calendar, document);
      return;
    } else if (calendar == null) {
      _format((Void)null, document);
      return;
    } else if (calendar != null) {
      _format(calendar, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(calendar, document).toString());
    }
  }
}
