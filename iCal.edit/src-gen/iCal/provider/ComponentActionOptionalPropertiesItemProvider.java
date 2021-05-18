/**
 */
package iCal.provider;

import iCal.ComponentActionOptionalProperties;
import iCal.ICalPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iCal.ComponentActionOptionalProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentActionOptionalPropertiesItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentActionOptionalPropertiesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRrulePropertyDescriptor(object);
			addAttachPropertyDescriptor(object);
			addAttendeePropertyDescriptor(object);
			addCategoriesPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addContactPropertyDescriptor(object);
			addExdatePropertyDescriptor(object);
			addRstatusPropertyDescriptor(object);
			addRelatedPropertyDescriptor(object);
			addResourcesPropertyDescriptor(object);
			addRdatePropertyDescriptor(object);
			addX_propPropertyDescriptor(object);
			addIana_propPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rrule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRrulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_rrule_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_rrule_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Attach feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttachPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_attach_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_attach_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Attendee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttendeePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentActionOptionalProperties_attendee_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentActionOptionalProperties_attendee_feature",
								"_UI_ComponentActionOptionalProperties_type"),
						ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Categories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentActionOptionalProperties_categories_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentActionOptionalProperties_categories_feature",
								"_UI_ComponentActionOptionalProperties_type"),
						ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_comment_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_comment_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_contact_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_contact_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exdate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_exdate_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_exdate_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rstatus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRstatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_rstatus_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_rstatus_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Related feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_related_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_related_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentActionOptionalProperties_resources_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentActionOptionalProperties_resources_feature",
								"_UI_ComponentActionOptionalProperties_type"),
						ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rdate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_rdate_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_rdate_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Xprop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentActionOptionalProperties_x_prop_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentActionOptionalProperties_x_prop_feature",
						"_UI_ComponentActionOptionalProperties_type"),
				ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Iana prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIana_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentActionOptionalProperties_iana_prop_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentActionOptionalProperties_iana_prop_feature",
								"_UI_ComponentActionOptionalProperties_type"),
						ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ComponentActionOptionalProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentActionOptionalProperties"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComponentActionOptionalProperties_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComponentActionOptionalProperties.class)) {
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP:
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ICalEditPlugin.INSTANCE;
	}

}
