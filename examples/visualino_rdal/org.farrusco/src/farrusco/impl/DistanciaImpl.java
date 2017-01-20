/**
 */
package farrusco.impl;

import farrusco.Distancia;
import farrusco.FarruscoPackage;
import farrusco.TipoDistancia;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distancia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link farrusco.impl.DistanciaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.impl.DistanciaImpl#getDistancia <em>Distancia</em>}</li>
 *   <li>{@link farrusco.impl.DistanciaImpl#getMenor_Maior <em>Menor Maior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistanciaImpl extends ConditionImpl implements Distancia
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = "Distancia";

  /**
   * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected String nome = NOME_EDEFAULT;

  /**
   * The default value of the '{@link #getDistancia() <em>Distancia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistancia()
   * @generated
   * @ordered
   */
  protected static final int DISTANCIA_EDEFAULT = 300;

  /**
   * The cached value of the '{@link #getDistancia() <em>Distancia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistancia()
   * @generated
   * @ordered
   */
  protected int distancia = DISTANCIA_EDEFAULT;

  /**
   * The default value of the '{@link #getMenor_Maior() <em>Menor Maior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenor_Maior()
   * @generated
   * @ordered
   */
  protected static final TipoDistancia MENOR_MAIOR_EDEFAULT = TipoDistancia.MAIOR;

  /**
   * The cached value of the '{@link #getMenor_Maior() <em>Menor Maior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenor_Maior()
   * @generated
   * @ordered
   */
  protected TipoDistancia menor_Maior = MENOR_MAIOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DistanciaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FarruscoPackage.Literals.DISTANCIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNome()
  {
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNome(String newNome)
  {
    String oldNome = nome;
    nome = newNome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.DISTANCIA__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDistancia()
  {
    return distancia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistancia(int newDistancia)
  {
    int oldDistancia = distancia;
    distancia = newDistancia;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.DISTANCIA__DISTANCIA, oldDistancia, distancia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoDistancia getMenor_Maior()
  {
    return menor_Maior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenor_Maior(TipoDistancia newMenor_Maior)
  {
    TipoDistancia oldMenor_Maior = menor_Maior;
    menor_Maior = newMenor_Maior == null ? MENOR_MAIOR_EDEFAULT : newMenor_Maior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.DISTANCIA__MENOR_MAIOR, oldMenor_Maior, menor_Maior));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FarruscoPackage.DISTANCIA__NOME:
        return getNome();
      case FarruscoPackage.DISTANCIA__DISTANCIA:
        return getDistancia();
      case FarruscoPackage.DISTANCIA__MENOR_MAIOR:
        return getMenor_Maior();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FarruscoPackage.DISTANCIA__NOME:
        setNome((String)newValue);
        return;
      case FarruscoPackage.DISTANCIA__DISTANCIA:
        setDistancia((Integer)newValue);
        return;
      case FarruscoPackage.DISTANCIA__MENOR_MAIOR:
        setMenor_Maior((TipoDistancia)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FarruscoPackage.DISTANCIA__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case FarruscoPackage.DISTANCIA__DISTANCIA:
        setDistancia(DISTANCIA_EDEFAULT);
        return;
      case FarruscoPackage.DISTANCIA__MENOR_MAIOR:
        setMenor_Maior(MENOR_MAIOR_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FarruscoPackage.DISTANCIA__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case FarruscoPackage.DISTANCIA__DISTANCIA:
        return distancia != DISTANCIA_EDEFAULT;
      case FarruscoPackage.DISTANCIA__MENOR_MAIOR:
        return menor_Maior != MENOR_MAIOR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (Nome: ");
    result.append(nome);
    result.append(", distancia: ");
    result.append(distancia);
    result.append(", Menor_Maior: ");
    result.append(menor_Maior);
    result.append(')');
    return result.toString();
  }

} //DistanciaImpl