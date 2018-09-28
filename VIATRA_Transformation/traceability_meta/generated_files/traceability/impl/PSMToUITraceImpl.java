/**
 */
package traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import psm.JElement;

import traceability.PSMToUITrace;
import traceability.TraceabilityPackage;

import ui.Identifiable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSM To UI Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceability.impl.PSMToUITraceImpl#getUiElements <em>Ui Elements</em>}</li>
 *   <li>{@link traceability.impl.PSMToUITraceImpl#getPsmElements <em>Psm Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSMToUITraceImpl extends MinimalEObjectImpl.Container implements PSMToUITrace {
	/**
	 * The cached value of the '{@link #getUiElements() <em>Ui Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> uiElements;

	/**
	 * The cached value of the '{@link #getPsmElements() <em>Psm Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsmElements()
	 * @generated
	 * @ordered
	 */
	protected EList<JElement> psmElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMToUITraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.PSM_TO_UI_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getUiElements() {
		if (uiElements == null) {
			uiElements = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, TraceabilityPackage.PSM_TO_UI_TRACE__UI_ELEMENTS);
		}
		return uiElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JElement> getPsmElements() {
		if (psmElements == null) {
			psmElements = new EObjectResolvingEList<JElement>(JElement.class, this, TraceabilityPackage.PSM_TO_UI_TRACE__PSM_ELEMENTS);
		}
		return psmElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.PSM_TO_UI_TRACE__UI_ELEMENTS:
				return getUiElements();
			case TraceabilityPackage.PSM_TO_UI_TRACE__PSM_ELEMENTS:
				return getPsmElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityPackage.PSM_TO_UI_TRACE__UI_ELEMENTS:
				getUiElements().clear();
				getUiElements().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case TraceabilityPackage.PSM_TO_UI_TRACE__PSM_ELEMENTS:
				getPsmElements().clear();
				getPsmElements().addAll((Collection<? extends JElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.PSM_TO_UI_TRACE__UI_ELEMENTS:
				getUiElements().clear();
				return;
			case TraceabilityPackage.PSM_TO_UI_TRACE__PSM_ELEMENTS:
				getPsmElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.PSM_TO_UI_TRACE__UI_ELEMENTS:
				return uiElements != null && !uiElements.isEmpty();
			case TraceabilityPackage.PSM_TO_UI_TRACE__PSM_ELEMENTS:
				return psmElements != null && !psmElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PSMToUITraceImpl
