/**
 */
package fr.tpt.useme.architecture.model.usemearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environmental Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement#getEnvitonmentType <em>Envitonment Type</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEnvironmentalElement()
 * @model abstract="true"
 * @generated
 */
public interface EnvironmentalElement extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Envitonment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.tpt.useme.architecture.model.usemearch.EnvironmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envitonment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envitonment Type</em>' attribute.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentType
	 * @see #setEnvitonmentType(EnvironmentType)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEnvironmentalElement_EnvitonmentType()
	 * @model
	 * @generated
	 */
	EnvironmentType getEnvitonmentType();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement#getEnvitonmentType <em>Envitonment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envitonment Type</em>' attribute.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentType
	 * @see #getEnvitonmentType()
	 * @generated
	 */
	void setEnvitonmentType(EnvironmentType value);

} // EnvironmentalElement
