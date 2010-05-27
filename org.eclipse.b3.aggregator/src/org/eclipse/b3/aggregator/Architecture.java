/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Architecture</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getArchitecture()
 * @model
 * @generated
 */
public enum Architecture implements Enumerator {
	/**
	 * The '<em><b>X86</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #X86_VALUE
	 * @generated
	 * @ordered
	 */
	X86(0, "X86", "x86"),

	/**
	 * The '<em><b>PPC</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #PPC_VALUE
	 * @generated
	 * @ordered
	 */
	PPC(1, "PPC", "ppc"),

	/**
	 * The '<em><b>X86 64</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #X86_64_VALUE
	 * @generated
	 * @ordered
	 */
	X86_64(2, "X86_64", "x86_64"), /**
	 * The '<em><b>IA64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #IA64_VALUE
	 * @generated
	 * @ordered
	 */
	IA64(3, "IA64", "ia64"), /**
	 * The '<em><b>IA64 32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #IA64_32_VALUE
	 * @generated
	 * @ordered
	 */
	IA64_32(4, "IA64_32", "ia64_32"), /**
	 * The '<em><b>Sparc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SPARC_VALUE
	 * @generated
	 * @ordered
	 */
	SPARC(5, "Sparc", "sparc"), /**
	 * The '<em><b>PPC64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PPC64_VALUE
	 * @generated
	 * @ordered
	 */
	PPC64(6, "PPC64", "ppc64"), /**
	 * The '<em><b>S360</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #S360_VALUE
	 * @generated
	 * @ordered
	 */
	S360(7, "S360", "s360"), /**
	 * The '<em><b>S360X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #S360X_VALUE
	 * @generated
	 * @ordered
	 */
	S360X(8, "S360X", "s360x");

	/**
	 * The '<em><b>X86</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #X86
	 * @model literal="x86"
	 * @generated
	 * @ordered
	 */
	public static final int X86_VALUE = 0;

	/**
	 * The '<em><b>PPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPC</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #PPC
	 * @model literal="ppc"
	 * @generated
	 * @ordered
	 */
	public static final int PPC_VALUE = 1;

	/**
	 * The '<em><b>X86 64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86 64</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #X86_64
	 * @model literal="x86_64"
	 * @generated
	 * @ordered
	 */
	public static final int X86_64_VALUE = 2;

	/**
	 * The '<em><b>IA64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IA64</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #IA64
	 * @model literal="ia64"
	 * @generated
	 * @ordered
	 */
	public static final int IA64_VALUE = 3;

	/**
	 * The '<em><b>IA64 32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IA64 32</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #IA64_32
	 * @model literal="ia64_32"
	 * @generated
	 * @ordered
	 */
	public static final int IA64_32_VALUE = 4;

	/**
	 * The '<em><b>Sparc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sparc</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SPARC
	 * @model name="Sparc" literal="sparc"
	 * @generated
	 * @ordered
	 */
	public static final int SPARC_VALUE = 5;

	/**
	 * The '<em><b>PPC64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPC64</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #PPC64
	 * @model literal="ppc64"
	 * @generated
	 * @ordered
	 */
	public static final int PPC64_VALUE = 6;

	/**
	 * The '<em><b>S360</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S360</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #S360
	 * @model literal="s360"
	 * @generated
	 * @ordered
	 */
	public static final int S360_VALUE = 7;

	/**
	 * The '<em><b>S360X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S360X</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #S360X
	 * @model literal="s360x"
	 * @generated
	 * @ordered
	 */
	public static final int S360X_VALUE = 8;

	/**
	 * An array of all the '<em><b>Architecture</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Architecture[] VALUES_ARRAY = new Architecture[] {
			X86, PPC, X86_64, IA64, IA64_32, SPARC, PPC64, S360, S360X, };

	/**
	 * A public read-only list of all the '<em><b>Architecture</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Architecture> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Architecture</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Architecture get(int value) {
		switch(value) {
			case X86_VALUE:
				return X86;
			case PPC_VALUE:
				return PPC;
			case X86_64_VALUE:
				return X86_64;
			case IA64_VALUE:
				return IA64;
			case IA64_32_VALUE:
				return IA64_32;
			case SPARC_VALUE:
				return SPARC;
			case PPC64_VALUE:
				return PPC64;
			case S360_VALUE:
				return S360;
			case S360X_VALUE:
				return S360X;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Architecture</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Architecture get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			Architecture result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Architecture</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Architecture getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			Architecture result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Architecture(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // Architecture
