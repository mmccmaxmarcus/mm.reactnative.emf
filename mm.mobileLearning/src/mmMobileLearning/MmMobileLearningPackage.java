/**
 */
package mmMobileLearning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mmMobileLearning.MmMobileLearningFactory
 * @model kind="package"
 * @generated
 */
public interface MmMobileLearningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mmMobileLearning";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mmMobileLearning";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MobileLearning";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmMobileLearningPackage eINSTANCE = mmMobileLearning.impl.MmMobileLearningPackageImpl.init();

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.MKnowledgeDomainImpl <em>MKnowledge Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.MKnowledgeDomainImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMKnowledgeDomain()
	 * @generated
	 */
	int MKNOWLEDGE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>MHas Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKNOWLEDGE_DOMAIN__MHAS_CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>MName KD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKNOWLEDGE_DOMAIN__MNAME_KD = 1;

	/**
	 * The feature id for the '<em><b>KDomain To Mmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE = 2;

	/**
	 * The feature id for the '<em><b>MKdomain To Screen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN = 3;

	/**
	 * The number of structural features of the '<em>MKnowledge Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKNOWLEDGE_DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>MKnowledge Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKNOWLEDGE_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.MConceptImpl <em>MConcept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.MConceptImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMConcept()
	 * @generated
	 */
	int MCONCEPT = 1;

	/**
	 * The feature id for the '<em><b>Name MConcept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONCEPT__NAME_MCONCEPT = 0;

	/**
	 * The feature id for the '<em><b>MSub Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONCEPT__MSUB_CONCEPT = 1;

	/**
	 * The feature id for the '<em><b>MHas Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONCEPT__MHAS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>MConcept To Screen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONCEPT__MCONCEPT_TO_SCREEN = 3;

	/**
	 * The number of structural features of the '<em>MConcept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONCEPT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>MConcept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.MReferenceImpl <em>MReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.MReferenceImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMReference()
	 * @generated
	 */
	int MREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>MReference To Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MREFERENCE__MREFERENCE_TO_CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>MName Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MREFERENCE__MNAME_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>MReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.ScreenImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Screen To Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__SCREEN_TO_ELEMENT_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ORIGEM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Screen To MModule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__SCREEN_TO_MMODULE = 3;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.ElementInterfaceImpl <em>Element Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.ElementInterfaceImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getElementInterface()
	 * @generated
	 */
	int ELEMENT_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INTERFACE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INTERFACE__ORIGEM_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Element Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.TextImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LABEL = ELEMENT_INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SUB_ELEMENT_INTERFACE = ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ORIGEM_ELEMENT = ELEMENT_INTERFACE__ORIGEM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_DISPLAY = ELEMENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_INFORMATION = ELEMENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TYPE = ELEMENT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ELEMENT_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = ELEMENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.ImageImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LABEL = ELEMENT_INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUB_ELEMENT_INTERFACE = ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ORIGEM_ELEMENT = ELEMENT_INTERFACE__ORIGEM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Textinformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXTINFORMATION = ELEMENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Img</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME_IMG = ELEMENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path Img</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH_IMG = ELEMENT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ELEMENT_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = ELEMENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.VideoImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__LABEL = ELEMENT_INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__SUB_ELEMENT_INTERFACE = ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ORIGEM_ELEMENT = ELEMENT_INTERFACE__ORIGEM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TEXT_INFORMATION = ELEMENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Video</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME_VIDEO = ELEMENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path Video</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__PATH_VIDEO = ELEMENT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__RESOLUTION = ELEMENT_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TIME = ELEMENT_INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = ELEMENT_INTERFACE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = ELEMENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.AudioImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__LABEL = ELEMENT_INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__SUB_ELEMENT_INTERFACE = ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ORIGEM_ELEMENT = ELEMENT_INTERFACE__ORIGEM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TEXT_INFORMATION = ELEMENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Audio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__NAME_AUDIO = ELEMENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path Audio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__PATH_AUDIO = ELEMENT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TIME = ELEMENT_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = ELEMENT_INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = ELEMENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.LinkImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = ELEMENT_INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SUB_ELEMENT_INTERFACE = ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ORIGEM_ELEMENT = ELEMENT_INTERFACE__ORIGEM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK = ELEMENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ELEMENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ELEMENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.impl.MModuleImpl <em>MModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.impl.MModuleImpl
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMModule()
	 * @generated
	 */
	int MMODULE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE__NAME_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE__VISIBLE = 2;

	/**
	 * The feature id for the '<em><b>MModule To MConcept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE__MMODULE_TO_MCONCEPT = 3;

	/**
	 * The feature id for the '<em><b>Sub Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE__SUB_MODULE = 4;

	/**
	 * The feature id for the '<em><b>MModule To Screen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE__MMODULE_TO_SCREEN = 5;

	/**
	 * The number of structural features of the '<em>MModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>MModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmMobileLearning.TextType <em>Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmMobileLearning.TextType
	 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link mmMobileLearning.MKnowledgeDomain <em>MKnowledge Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKnowledge Domain</em>'.
	 * @see mmMobileLearning.MKnowledgeDomain
	 * @generated
	 */
	EClass getMKnowledgeDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MKnowledgeDomain#getMHasConcept <em>MHas Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MHas Concept</em>'.
	 * @see mmMobileLearning.MKnowledgeDomain#getMHasConcept()
	 * @see #getMKnowledgeDomain()
	 * @generated
	 */
	EReference getMKnowledgeDomain_MHasConcept();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.MKnowledgeDomain#getMNameKD <em>MName KD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MName KD</em>'.
	 * @see mmMobileLearning.MKnowledgeDomain#getMNameKD()
	 * @see #getMKnowledgeDomain()
	 * @generated
	 */
	EAttribute getMKnowledgeDomain_MNameKD();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MKnowledgeDomain#getKDomainToMmodule <em>KDomain To Mmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>KDomain To Mmodule</em>'.
	 * @see mmMobileLearning.MKnowledgeDomain#getKDomainToMmodule()
	 * @see #getMKnowledgeDomain()
	 * @generated
	 */
	EReference getMKnowledgeDomain_KDomainToMmodule();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MKnowledgeDomain#getMKdomainToScreen <em>MKdomain To Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MKdomain To Screen</em>'.
	 * @see mmMobileLearning.MKnowledgeDomain#getMKdomainToScreen()
	 * @see #getMKnowledgeDomain()
	 * @generated
	 */
	EReference getMKnowledgeDomain_MKdomainToScreen();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.MConcept <em>MConcept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MConcept</em>'.
	 * @see mmMobileLearning.MConcept
	 * @generated
	 */
	EClass getMConcept();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.MConcept#getNameMConcept <em>Name MConcept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name MConcept</em>'.
	 * @see mmMobileLearning.MConcept#getNameMConcept()
	 * @see #getMConcept()
	 * @generated
	 */
	EAttribute getMConcept_NameMConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MConcept#getMSubConcept <em>MSub Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MSub Concept</em>'.
	 * @see mmMobileLearning.MConcept#getMSubConcept()
	 * @see #getMConcept()
	 * @generated
	 */
	EReference getMConcept_MSubConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MConcept#getMHasReference <em>MHas Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MHas Reference</em>'.
	 * @see mmMobileLearning.MConcept#getMHasReference()
	 * @see #getMConcept()
	 * @generated
	 */
	EReference getMConcept_MHasReference();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MConcept#getMConceptToScreen <em>MConcept To Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MConcept To Screen</em>'.
	 * @see mmMobileLearning.MConcept#getMConceptToScreen()
	 * @see #getMConcept()
	 * @generated
	 */
	EReference getMConcept_MConceptToScreen();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.MReference <em>MReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MReference</em>'.
	 * @see mmMobileLearning.MReference
	 * @generated
	 */
	EClass getMReference();

	/**
	 * Returns the meta object for the reference '{@link mmMobileLearning.MReference#getMReferenceToConcept <em>MReference To Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MReference To Concept</em>'.
	 * @see mmMobileLearning.MReference#getMReferenceToConcept()
	 * @see #getMReference()
	 * @generated
	 */
	EReference getMReference_MReferenceToConcept();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.MReference#getMNameReference <em>MName Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MName Reference</em>'.
	 * @see mmMobileLearning.MReference#getMNameReference()
	 * @see #getMReference()
	 * @generated
	 */
	EAttribute getMReference_MNameReference();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see mmMobileLearning.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Screen#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see mmMobileLearning.Screen#getLabel()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.Screen#getScreenToElementInterface <em>Screen To Element Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screen To Element Interface</em>'.
	 * @see mmMobileLearning.Screen#getScreenToElementInterface()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_ScreenToElementInterface();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Screen#getOrigemElement <em>Origem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origem Element</em>'.
	 * @see mmMobileLearning.Screen#getOrigemElement()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_OrigemElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.Screen#getScreenToMModule <em>Screen To MModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screen To MModule</em>'.
	 * @see mmMobileLearning.Screen#getScreenToMModule()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_ScreenToMModule();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see mmMobileLearning.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Text#getTextDisplay <em>Text Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Display</em>'.
	 * @see mmMobileLearning.Text#getTextDisplay()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextDisplay();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Text#getTextInformation <em>Text Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Information</em>'.
	 * @see mmMobileLearning.Text#getTextInformation()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextInformation();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Text#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mmMobileLearning.Text#getType()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Type();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see mmMobileLearning.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Image#getTextinformation <em>Textinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textinformation</em>'.
	 * @see mmMobileLearning.Image#getTextinformation()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Textinformation();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Image#getNameImg <em>Name Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Img</em>'.
	 * @see mmMobileLearning.Image#getNameImg()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_NameImg();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Image#getPathImg <em>Path Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Img</em>'.
	 * @see mmMobileLearning.Image#getPathImg()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_PathImg();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see mmMobileLearning.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Video#getTextInformation <em>Text Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Information</em>'.
	 * @see mmMobileLearning.Video#getTextInformation()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_TextInformation();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Video#getNameVideo <em>Name Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Video</em>'.
	 * @see mmMobileLearning.Video#getNameVideo()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_NameVideo();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Video#getPathVideo <em>Path Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Video</em>'.
	 * @see mmMobileLearning.Video#getPathVideo()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_PathVideo();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Video#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see mmMobileLearning.Video#getResolution()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Video#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see mmMobileLearning.Video#getTime()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Time();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see mmMobileLearning.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Audio#getTextInformation <em>Text Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Information</em>'.
	 * @see mmMobileLearning.Audio#getTextInformation()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_TextInformation();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Audio#getNameAudio <em>Name Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Audio</em>'.
	 * @see mmMobileLearning.Audio#getNameAudio()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_NameAudio();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Audio#getPathAudio <em>Path Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Audio</em>'.
	 * @see mmMobileLearning.Audio#getPathAudio()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_PathAudio();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Audio#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see mmMobileLearning.Audio#getTime()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Time();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see mmMobileLearning.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.Link#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see mmMobileLearning.Link#getLink()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Link();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.ElementInterface <em>Element Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Interface</em>'.
	 * @see mmMobileLearning.ElementInterface
	 * @generated
	 */
	EClass getElementInterface();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.ElementInterface#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see mmMobileLearning.ElementInterface#getLabel()
	 * @see #getElementInterface()
	 * @generated
	 */
	EAttribute getElementInterface_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.ElementInterface#getSubElementInterface <em>Sub Element Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Element Interface</em>'.
	 * @see mmMobileLearning.ElementInterface#getSubElementInterface()
	 * @see #getElementInterface()
	 * @generated
	 */
	EReference getElementInterface_SubElementInterface();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.ElementInterface#getOrigemElement <em>Origem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origem Element</em>'.
	 * @see mmMobileLearning.ElementInterface#getOrigemElement()
	 * @see #getElementInterface()
	 * @generated
	 */
	EAttribute getElementInterface_OrigemElement();

	/**
	 * Returns the meta object for class '{@link mmMobileLearning.MModule <em>MModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MModule</em>'.
	 * @see mmMobileLearning.MModule
	 * @generated
	 */
	EClass getMModule();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.MModule#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see mmMobileLearning.MModule#getLabel()
	 * @see #getMModule()
	 * @generated
	 */
	EAttribute getMModule_Label();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.MModule#getNameModule <em>Name Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Module</em>'.
	 * @see mmMobileLearning.MModule#getNameModule()
	 * @see #getMModule()
	 * @generated
	 */
	EAttribute getMModule_NameModule();

	/**
	 * Returns the meta object for the attribute '{@link mmMobileLearning.MModule#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see mmMobileLearning.MModule#isVisible()
	 * @see #getMModule()
	 * @generated
	 */
	EAttribute getMModule_Visible();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MModule#getMModuleToMConcept <em>MModule To MConcept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MModule To MConcept</em>'.
	 * @see mmMobileLearning.MModule#getMModuleToMConcept()
	 * @see #getMModule()
	 * @generated
	 */
	EReference getMModule_MModuleToMConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MModule#getSubModule <em>Sub Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Module</em>'.
	 * @see mmMobileLearning.MModule#getSubModule()
	 * @see #getMModule()
	 * @generated
	 */
	EReference getMModule_SubModule();

	/**
	 * Returns the meta object for the containment reference list '{@link mmMobileLearning.MModule#getMModuleToScreen <em>MModule To Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MModule To Screen</em>'.
	 * @see mmMobileLearning.MModule#getMModuleToScreen()
	 * @see #getMModule()
	 * @generated
	 */
	EReference getMModule_MModuleToScreen();

	/**
	 * Returns the meta object for enum '{@link mmMobileLearning.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Type</em>'.
	 * @see mmMobileLearning.TextType
	 * @generated
	 */
	EEnum getTextType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmMobileLearningFactory getMmMobileLearningFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.MKnowledgeDomainImpl <em>MKnowledge Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.MKnowledgeDomainImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMKnowledgeDomain()
		 * @generated
		 */
		EClass MKNOWLEDGE_DOMAIN = eINSTANCE.getMKnowledgeDomain();

		/**
		 * The meta object literal for the '<em><b>MHas Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKNOWLEDGE_DOMAIN__MHAS_CONCEPT = eINSTANCE.getMKnowledgeDomain_MHasConcept();

		/**
		 * The meta object literal for the '<em><b>MName KD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKNOWLEDGE_DOMAIN__MNAME_KD = eINSTANCE.getMKnowledgeDomain_MNameKD();

		/**
		 * The meta object literal for the '<em><b>KDomain To Mmodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE = eINSTANCE.getMKnowledgeDomain_KDomainToMmodule();

		/**
		 * The meta object literal for the '<em><b>MKdomain To Screen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN = eINSTANCE.getMKnowledgeDomain_MKdomainToScreen();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.MConceptImpl <em>MConcept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.MConceptImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMConcept()
		 * @generated
		 */
		EClass MCONCEPT = eINSTANCE.getMConcept();

		/**
		 * The meta object literal for the '<em><b>Name MConcept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCONCEPT__NAME_MCONCEPT = eINSTANCE.getMConcept_NameMConcept();

		/**
		 * The meta object literal for the '<em><b>MSub Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONCEPT__MSUB_CONCEPT = eINSTANCE.getMConcept_MSubConcept();

		/**
		 * The meta object literal for the '<em><b>MHas Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONCEPT__MHAS_REFERENCE = eINSTANCE.getMConcept_MHasReference();

		/**
		 * The meta object literal for the '<em><b>MConcept To Screen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONCEPT__MCONCEPT_TO_SCREEN = eINSTANCE.getMConcept_MConceptToScreen();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.MReferenceImpl <em>MReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.MReferenceImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMReference()
		 * @generated
		 */
		EClass MREFERENCE = eINSTANCE.getMReference();

		/**
		 * The meta object literal for the '<em><b>MReference To Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MREFERENCE__MREFERENCE_TO_CONCEPT = eINSTANCE.getMReference_MReferenceToConcept();

		/**
		 * The meta object literal for the '<em><b>MName Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MREFERENCE__MNAME_REFERENCE = eINSTANCE.getMReference_MNameReference();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.ScreenImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__LABEL = eINSTANCE.getScreen_Label();

		/**
		 * The meta object literal for the '<em><b>Screen To Element Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__SCREEN_TO_ELEMENT_INTERFACE = eINSTANCE.getScreen_ScreenToElementInterface();

		/**
		 * The meta object literal for the '<em><b>Origem Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__ORIGEM_ELEMENT = eINSTANCE.getScreen_OrigemElement();

		/**
		 * The meta object literal for the '<em><b>Screen To MModule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__SCREEN_TO_MMODULE = eINSTANCE.getScreen_ScreenToMModule();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.TextImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_DISPLAY = eINSTANCE.getText_TextDisplay();

		/**
		 * The meta object literal for the '<em><b>Text Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_INFORMATION = eINSTANCE.getText_TextInformation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TYPE = eINSTANCE.getText_Type();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.ImageImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Textinformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TEXTINFORMATION = eINSTANCE.getImage_Textinformation();

		/**
		 * The meta object literal for the '<em><b>Name Img</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME_IMG = eINSTANCE.getImage_NameImg();

		/**
		 * The meta object literal for the '<em><b>Path Img</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH_IMG = eINSTANCE.getImage_PathImg();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.VideoImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Text Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__TEXT_INFORMATION = eINSTANCE.getVideo_TextInformation();

		/**
		 * The meta object literal for the '<em><b>Name Video</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__NAME_VIDEO = eINSTANCE.getVideo_NameVideo();

		/**
		 * The meta object literal for the '<em><b>Path Video</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__PATH_VIDEO = eINSTANCE.getVideo_PathVideo();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__RESOLUTION = eINSTANCE.getVideo_Resolution();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__TIME = eINSTANCE.getVideo_Time();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.AudioImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Text Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__TEXT_INFORMATION = eINSTANCE.getAudio_TextInformation();

		/**
		 * The meta object literal for the '<em><b>Name Audio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__NAME_AUDIO = eINSTANCE.getAudio_NameAudio();

		/**
		 * The meta object literal for the '<em><b>Path Audio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__PATH_AUDIO = eINSTANCE.getAudio_PathAudio();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__TIME = eINSTANCE.getAudio_Time();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.LinkImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LINK = eINSTANCE.getLink_Link();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.ElementInterfaceImpl <em>Element Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.ElementInterfaceImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getElementInterface()
		 * @generated
		 */
		EClass ELEMENT_INTERFACE = eINSTANCE.getElementInterface();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INTERFACE__LABEL = eINSTANCE.getElementInterface_Label();

		/**
		 * The meta object literal for the '<em><b>Sub Element Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE = eINSTANCE.getElementInterface_SubElementInterface();

		/**
		 * The meta object literal for the '<em><b>Origem Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INTERFACE__ORIGEM_ELEMENT = eINSTANCE.getElementInterface_OrigemElement();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.impl.MModuleImpl <em>MModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.impl.MModuleImpl
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getMModule()
		 * @generated
		 */
		EClass MMODULE = eINSTANCE.getMModule();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMODULE__LABEL = eINSTANCE.getMModule_Label();

		/**
		 * The meta object literal for the '<em><b>Name Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMODULE__NAME_MODULE = eINSTANCE.getMModule_NameModule();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMODULE__VISIBLE = eINSTANCE.getMModule_Visible();

		/**
		 * The meta object literal for the '<em><b>MModule To MConcept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMODULE__MMODULE_TO_MCONCEPT = eINSTANCE.getMModule_MModuleToMConcept();

		/**
		 * The meta object literal for the '<em><b>Sub Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMODULE__SUB_MODULE = eINSTANCE.getMModule_SubModule();

		/**
		 * The meta object literal for the '<em><b>MModule To Screen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMODULE__MMODULE_TO_SCREEN = eINSTANCE.getMModule_MModuleToScreen();

		/**
		 * The meta object literal for the '{@link mmMobileLearning.TextType <em>Text Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmMobileLearning.TextType
		 * @see mmMobileLearning.impl.MmMobileLearningPackageImpl#getTextType()
		 * @generated
		 */
		EEnum TEXT_TYPE = eINSTANCE.getTextType();

	}

} //MmMobileLearningPackage
