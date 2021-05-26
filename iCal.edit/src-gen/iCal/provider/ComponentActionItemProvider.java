/**
 */
package iCal.provider;

import iCal.ComponentAction;
import iCal.ICalPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iCal.ComponentAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentActionItemProvider extends ComponentRequiredItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentActionItemProvider(AdapterFactory adapterFactory) {
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

			addDtstartPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addCreatedPropertyDescriptor(object);
			addLast_modPropertyDescriptor(object);
			addOrganizerPropertyDescriptor(object);
			addSeqPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addRecuridPropertyDescriptor(object);
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
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dtstart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDtstartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_dtstart_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_dtstart_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__DTSTART, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_class_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_class_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_created_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_created_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__CREATED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Last mod feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLast_modPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_last_mod_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_last_mod_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__LAST_MOD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Organizer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_organizer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_organizer_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__ORGANIZER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Seq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeqPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_seq_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_seq_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__SEQ, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_status_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_status_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__STATUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_summary_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_summary_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__SUMMARY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_url_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_url_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__URL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Recurid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecuridPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_recurid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_recurid_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__RECURID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rrule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRrulePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_rrule_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_rrule_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__RRULE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Attach feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttachPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_attach_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_attach_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__ATTACH, true, false, false,
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
						getResourceLocator(), getString("_UI_ComponentAction_attendee_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_attendee_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__ATTENDEE, true, false, false,
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
						getResourceLocator(), getString("_UI_ComponentAction_categories_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_categories_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__CATEGORIES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_comment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_comment_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__COMMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_contact_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_contact_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__CONTACT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exdate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_exdate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_exdate_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__EXDATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rstatus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRstatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_rstatus_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_rstatus_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__RSTATUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Related feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_related_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_related_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__RELATED, true, false, false,
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
						getResourceLocator(), getString("_UI_ComponentAction_resources_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_resources_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__RESOURCES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rdate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_rdate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_rdate_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__RDATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Xprop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_x_prop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_x_prop_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__XPROP, true, false, false,
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
						getResourceLocator(), getString("_UI_ComponentAction_iana_prop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_iana_prop_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__IANA_PROP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentAction_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentAction_description_feature",
								"_UI_ComponentAction_type"),
						ICalPackage.Literals.COMPONENT_ACTION__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
		String label = ((ComponentAction) object).getDtstamp();
		return label == null || label.length() == 0 ? getString("_UI_ComponentAction_type")
				: getString("_UI_ComponentAction_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentAction.class)) {
		case ICalPackage.COMPONENT_ACTION__DTSTART:
		case ICalPackage.COMPONENT_ACTION__CLASS:
		case ICalPackage.COMPONENT_ACTION__CREATED:
		case ICalPackage.COMPONENT_ACTION__LAST_MOD:
		case ICalPackage.COMPONENT_ACTION__ORGANIZER:
		case ICalPackage.COMPONENT_ACTION__SEQ:
		case ICalPackage.COMPONENT_ACTION__STATUS:
		case ICalPackage.COMPONENT_ACTION__SUMMARY:
		case ICalPackage.COMPONENT_ACTION__URL:
		case ICalPackage.COMPONENT_ACTION__RECURID:
		case ICalPackage.COMPONENT_ACTION__RRULE:
		case ICalPackage.COMPONENT_ACTION__ATTACH:
		case ICalPackage.COMPONENT_ACTION__ATTENDEE:
		case ICalPackage.COMPONENT_ACTION__CATEGORIES:
		case ICalPackage.COMPONENT_ACTION__COMMENT:
		case ICalPackage.COMPONENT_ACTION__CONTACT:
		case ICalPackage.COMPONENT_ACTION__EXDATE:
		case ICalPackage.COMPONENT_ACTION__RSTATUS:
		case ICalPackage.COMPONENT_ACTION__RELATED:
		case ICalPackage.COMPONENT_ACTION__RESOURCES:
		case ICalPackage.COMPONENT_ACTION__RDATE:
		case ICalPackage.COMPONENT_ACTION__XPROP:
		case ICalPackage.COMPONENT_ACTION__IANA_PROP:
		case ICalPackage.COMPONENT_ACTION__DESCRIPTION:
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

}
