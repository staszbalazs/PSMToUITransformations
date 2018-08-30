package operations;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import psm.JAttribute;
import psm.JClass;
import psm.JUIAlias;
import psm.JUIAttributeGroup;
import queries.PatternProvider;
import queries.PsmToUiTrace;
import ui.UIAttributeComponentType;
import ui.UIBaseComponentType;
import ui.UIClass;
import ui.UIClassView;
import ui.UIListView;
import ui.UIReferenceComponentType;
import ui.UIViewField;
import ui.UIViewFieldSet;
import ui.UiPackage;

@SuppressWarnings("all")
public class Views {
  @Extension
  private IModelManipulations manipulation;
  
  @Extension
  private UiPackage uiPackage = UiPackage.eINSTANCE;
  
  public UIClassView createClassView(final UIClass uiClass, final JClass jClass, final JUIAlias alias, final Boolean isDefault, final ViatraQueryEngine engine) {
    try {
      EObject _createChild = this.manipulation.createChild(uiClass, this.uiPackage.getUIClass_ClassViews(), this.uiPackage.getUIClassView());
      final UIClassView classView = ((UIClassView) _createChild);
      if ((alias != null)) {
        String _replace = uiClass.getUuid().replace("\\.", "_");
        String _plus = (_replace + "_oview_");
        String _name = alias.getName();
        String _plus_1 = (_plus + _name);
        classView.setUuid(_plus_1);
        classView.setName(alias.getName());
      } else {
        String _replace_1 = uiClass.getUuid().replace("\\.", "_");
        String _plus_2 = (_replace_1 + "_oview_default");
        classView.setUuid(_plus_2);
        classView.setName(uiClass.getName());
      }
      classView.setIsDefault((isDefault).booleanValue());
      int position = 1;
      EList<UIAttributeComponentType> _attributes = uiClass.getAttributes();
      Set<UIAttributeComponentType> remaining = ((HashSet<UIAttributeComponentType>) _attributes);
      String vfsName = null;
      EList<JUIAttributeGroup> _attributeOrder = jClass.getAttributeOrder();
      for (final JUIAttributeGroup attrGroup : _attributeOrder) {
        {
          boolean _startsWith = attrGroup.getAttributes().get(0).getName().startsWith("-");
          if (_startsWith) {
            vfsName = attrGroup.getAttributes().get(0).getName().substring(1);
            attrGroup.getAttributes().remove(attrGroup.getAttributes().get(0));
          } else {
            vfsName = attrGroup.getAttributes().get(0).getName();
          }
          EObject _createChild_1 = this.manipulation.createChild(classView, this.uiPackage.getUIView_ViewFieldSets(), this.uiPackage.getUIViewFieldSet());
          final UIViewFieldSet viewFieldSet = ((UIViewFieldSet) _createChild_1);
          viewFieldSet.setName(vfsName);
          String _uuid = classView.getUuid();
          String _plus_3 = (_uuid + "_viewfieldset_");
          String _plus_4 = (_plus_3 + vfsName);
          String _plus_5 = (_plus_4 + "_Group");
          viewFieldSet.setUuid(_plus_5);
          int _plusPlus = position++;
          viewFieldSet.setPosition(_plusPlus);
          int viewFieldPosition = 1;
          EList<JAttribute> _attributes_1 = attrGroup.getAttributes();
          for (final JAttribute attribute : _attributes_1) {
            {
              EObject _createChild_2 = this.manipulation.createChild(viewFieldSet, this.uiPackage.getUIViewFieldSet_ViewFields(), this.uiPackage.getUIViewField());
              final UIViewField viewField = ((UIViewField) _createChild_2);
              final PsmToUiTrace.Match match = PatternProvider.instance().getPsmToUiTrace(engine).getOneArbitraryMatch(attribute, null).get();
              Object _identifiable = match.getIdentifiable();
              final UIBaseComponentType uiBaseType = ((UIBaseComponentType) _identifiable);
              viewField.setComponentType(uiBaseType);
              viewField.setName(attribute.getName());
              String _uuid_1 = classView.getUuid();
              String _plus_6 = (_uuid_1 + ".");
              String _name_1 = viewField.getComponentType().getName();
              String _plus_7 = (_plus_6 + _name_1);
              String _plus_8 = (_plus_7 + "_viewField_classView");
              viewField.setUuid(_plus_8);
              boolean _isUiNoSearch = attribute.isUiNoSearch();
              boolean _not = (!_isUiNoSearch);
              viewField.setSearchable(_not);
              viewField.setPosition(viewFieldPosition);
              viewFieldPosition++;
              remaining.remove(uiBaseType);
            }
          }
        }
      }
      for (final UIAttributeComponentType attribute : remaining) {
        if (((((attribute instanceof UIReferenceComponentType) && ((UIReferenceComponentType) attribute).isNavigable()) && (!attribute.isPrivate())) || ((attribute instanceof UIBaseComponentType) && (!attribute.isPrivate())))) {
          EObject _createChild_1 = this.manipulation.createChild(classView, this.uiPackage.getUIView_ViewFieldSets(), this.uiPackage.getUIViewFieldSet());
          final UIViewFieldSet viewFieldSet = ((UIViewFieldSet) _createChild_1);
          viewFieldSet.setName(attribute.getName());
          String _uuid = classView.getUuid();
          String _plus_3 = (_uuid + "_viewfieldset_");
          String _name_1 = attribute.getName();
          String _plus_4 = (_plus_3 + _name_1);
          viewFieldSet.setUuid(_plus_4);
          int _plusPlus = position++;
          viewFieldSet.setPosition(_plusPlus);
          EObject _createChild_2 = this.manipulation.createChild(viewFieldSet, this.uiPackage.getUIViewFieldSet_ViewFields(), this.uiPackage.getUIViewField());
          final UIViewField viewField = ((UIViewField) _createChild_2);
          viewField.setName(attribute.getName());
          String _uuid_1 = attribute.getUuid();
          String _plus_5 = (_uuid_1 + "_viewField_classView");
          viewField.setUuid(_plus_5);
          viewField.setComponentType(attribute);
          final Predicate<JAttribute> _function = (JAttribute it) -> {
            String _uuid_2 = it.getUuid();
            String _uuid_3 = attribute.getUuid();
            return Objects.equal(_uuid_2, _uuid_3);
          };
          final JAttribute jAttr = jClass.getAttributes().stream().filter(_function).findFirst().get();
          boolean _isUiNoSearch = jAttr.isUiNoSearch();
          boolean _not = (!_isUiNoSearch);
          viewField.setSearchable(_not);
        }
      }
      return classView;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public UIListView createListView(final UIClass uiClass, final JClass jClass, final JUIAlias alias, final UIClassView classView, final Boolean isDefault, final ViatraQueryEngine engine) {
    try {
      EObject _createChild = this.manipulation.createChild(uiClass, this.uiPackage.getUIClass_ListViews(), this.uiPackage.getUIListView());
      final UIListView listView = ((UIListView) _createChild);
      if ((alias != null)) {
        String _replace = uiClass.getUuid().replace("\\.", "_");
        String _plus = (_replace + "_lview_");
        String _name = alias.getName();
        String _plus_1 = (_plus + _name);
        listView.setUuid(_plus_1);
        listView.setName(alias.getName());
      } else {
        String _replace_1 = uiClass.getUuid().replace("\\.", "_");
        String _plus_2 = (_replace_1 + "_lview_default");
        listView.setUuid(_plus_2);
        listView.setName(uiClass.getName());
      }
      listView.setIsDefault((isDefault).booleanValue());
      listView.setPageSize(20);
      listView.setDetailView(classView);
      EObject _createChild_1 = this.manipulation.createChild(listView, this.uiPackage.getUIView_ViewFieldSets(), this.uiPackage.getUIViewFieldSet());
      UIViewFieldSet viewFieldSet = ((UIViewFieldSet) _createChild_1);
      viewFieldSet.setName(listView.getName());
      String _uuid = listView.getUuid();
      String _plus_3 = (_uuid + "_viewfieldset_");
      String _name_1 = listView.getName();
      String _plus_4 = (_plus_3 + _name_1);
      viewFieldSet.setUuid(_plus_4);
      int position = jClass.getAttributesForListing().size();
      EList<UIAttributeComponentType> _attributes = uiClass.getAttributes();
      for (final UIAttributeComponentType attribute : _attributes) {
        if ((((((attribute instanceof UIReferenceComponentType) && (attribute.getUpper() == 1)) && ((UIReferenceComponentType) attribute).isNavigable()) && (!attribute.isPrivate())) || ((attribute instanceof UIBaseComponentType) && (!attribute.isPrivate())))) {
          EObject _createChild_2 = this.manipulation.createChild(viewFieldSet, this.uiPackage.getUIViewFieldSet_ViewFields(), this.uiPackage.getUIViewField());
          final UIViewField viewField = ((UIViewField) _createChild_2);
          String _uuid_1 = attribute.getUuid();
          String _plus_5 = (_uuid_1 + "_viewField_listView");
          viewField.setUuid(_plus_5);
          viewField.setName(attribute.getName());
          viewField.setComponentType(attribute);
          final Predicate<JAttribute> _function = (JAttribute it) -> {
            String _uuid_2 = it.getUuid();
            String _uuid_3 = attribute.getUuid();
            return Objects.equal(_uuid_2, _uuid_3);
          };
          JAttribute _get = jClass.getAttributes().stream().filter(_function).findFirst().get();
          final JAttribute jAttr = ((JAttribute) _get);
          boolean _isUiNoSearch = jAttr.isUiNoSearch();
          boolean _not = (!_isUiNoSearch);
          viewField.setSearchable(_not);
          boolean _contains = jClass.getAttributesForListing().contains(jAttr);
          if (_contains) {
            int _indexOf = jClass.getAttributesForListing().indexOf(jAttr);
            int _plus_6 = (_indexOf + 1);
            viewField.setPosition(_plus_6);
          } else {
            int _size = jClass.getAttributesForListing().size();
            boolean _greaterThan = (_size > 0);
            if (_greaterThan) {
              viewField.setShow(false);
            }
            position++;
            viewField.setPosition(position);
          }
        }
      }
      return listView;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
