/**
 */
package traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import psm.JModel;

import traceability.PSMToUI;
import traceability.PSMToUITrace;
import traceability.TraceabilityPackage;

import ui.UIBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSM To UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceability.impl.PSMToUIImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.impl.PSMToUIImpl#getJModel <em>JModel</em>}</li>
 *   <li>{@link traceability.impl.PSMToUIImpl#getUiBase <em>Ui Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSMToUIImpl extends MinimalEObjectImpl.Container implements PSMToUI {
	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<PSMToUITrace> traces;

	/**
	 * The cached value of the '{@link #getJModel() <em>JModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJModel()
	 * @generated
	 * @ordered
	 */
	protected JModel jModel;

	/**
	 * The cached value of the '{@link #getUiBase() <em>Ui Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiBase()
	 * @generated
	 * @ordered
	 */
	protected UIBase uiBase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMToUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.PSM_TO_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSMToUITrace> getTraces() {
		if (traces == null) {
			traces = new EObjectResolvingEList<PSMToUITrace>(PSMToUITrace.class, this, TraceabilityPackage.PSM_TO_UI__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JModel getJModel() {
		if (jModel != null && jModel.eIsProxy()) {
			InternalEObject oldJModel = (InternalEObject)jModel;
			jModel = (JModel)eResolveProxy(oldJModel);
			if (jModel != oldJModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.PSM_TO_UI__JMODEL, oldJModel, jModel));
			}
		}
		return jModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JModel basicGetJModel() {
		return jModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJModel(JModel newJModel) {
		JModel oldJModel = jModel;
		jModel = newJModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.PSM_TO_UI__JMODEL, oldJModel, jModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIBase getUiBase() {
		if (uiBase != null && uiBase.eIsProxy()) {
			InternalEObject oldUiBase = (InternalEObject)uiBase;
			uiBase = (UIBase)eResolveProxy(oldUiBase);
			if (uiBase != oldUiBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.PSM_TO_UI__UI_BASE, oldUiBase, uiBase));
			}
		}
		return uiBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIBase basicGetUiBase() {
		return uiBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiBase(UIBase newUiBase) {
		UIBase oldUiBase = uiBase;
		uiBase = newUiBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.PSM_TO_UI__UI_BASE, oldUiBase, uiBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.PSM_TO_UI__TRACES:
				return getTraces();
			case TraceabilityPackage.PSM_TO_UI__JMODEL:
				if (resolve) return getJModel();
				return basicGetJModel();
			case TraceabilityPackage.PSM_TO_UI__UI_BASE:
				if (resolve) return getUiBase();
				return basicGetUiBase();
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
			case TraceabilityPackage.PSM_TO_UI__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends PSMToUITrace>)newValue);
				return;
			case TraceabilityPackage.PSM_TO_UI__JMODEL:
				setJModel((JModel)newValue);
				return;
			case TraceabilityPackage.PSM_TO_UI__UI_BASE:
				setUiBase((UIBase)newValue);
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
			case TraceabilityPackage.PSM_TO_UI__TRACES:
				getTraces().clear();
				return;
			case TraceabilityPackage.PSM_TO_UI__JMODEL:
				setJModel((JModel)null);
				return;
			case TraceabilityPackage.PSM_TO_UI__UI_BASE:
				setUiBase((UIBase)null);
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
			case TraceabilityPackage.PSM_TO_UI__TRACES:
				return traces != null && !traces.isEmpty();
			case TraceabilityPackage.PSM_TO_UI__JMODEL:
				return jModel != null;
			case TraceabilityPackage.PSM_TO_UI__UI_BASE:
				return uiBase != null;
		}
		return super.eIsSet(featureID);
	}

} //PSMToUIImpl
