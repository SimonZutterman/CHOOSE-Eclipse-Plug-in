package CHOOSE.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import CHOOSE.diagram.edit.parts.ActorContainerAccountableForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerAssignmentsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerConsultedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerControlsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerInformedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerMonitorsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerResponsibleForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerWishesEditPart;
import CHOOSE.diagram.edit.parts.ActorEditPart;
import CHOOSE.diagram.edit.parts.DeviceEditPart;
import CHOOSE.diagram.edit.parts.DiagramEditPart;
import CHOOSE.diagram.edit.parts.GoalAndEditPart;
import CHOOSE.diagram.edit.parts.GoalAssignedToEditPart;
import CHOOSE.diagram.edit.parts.GoalConcernsObjectsEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictedEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictsEditPart;
import CHOOSE.diagram.edit.parts.GoalEditPart;
import CHOOSE.diagram.edit.parts.GoalOperationalizedByEditPart;
import CHOOSE.diagram.edit.parts.GoalOrEditPart;
import CHOOSE.diagram.edit.parts.GoalWishedByEditPart;
import CHOOSE.diagram.edit.parts.HumanActorEditPart;
import CHOOSE.diagram.edit.parts.HumanActorPerformsEditPart;
import CHOOSE.diagram.edit.parts.HumanActorSuperviseesEditPart;
import CHOOSE.diagram.edit.parts.HumanActorSupervisorsEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatedEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatesEditPart;
import CHOOSE.diagram.edit.parts.ObjectConcernsGoalsEditPart;
import CHOOSE.diagram.edit.parts.ObjectControlledByEditPart;
import CHOOSE.diagram.edit.parts.ObjectEditPart;
import CHOOSE.diagram.edit.parts.ObjectIncludesEditPart;
import CHOOSE.diagram.edit.parts.ObjectInputForEditPart;
import CHOOSE.diagram.edit.parts.ObjectMonitoredByEditPart;
import CHOOSE.diagram.edit.parts.ObjectOutputOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectPartOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializationEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializedByEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerAccountableEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerConsultEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInformEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOperationalizesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOutputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerResponsibleEditPart;
import CHOOSE.diagram.edit.parts.OperationEditPart;
import CHOOSE.diagram.edit.parts.ProcessEditPart;
import CHOOSE.diagram.edit.parts.ProjectEditPart;
import CHOOSE.diagram.edit.parts.RefinementEditPart;
import CHOOSE.diagram.edit.parts.RefinementSubgoalsEditPart;
import CHOOSE.diagram.edit.parts.RefinementSupergoalEditPart;
import CHOOSE.diagram.edit.parts.RoleEditPart;
import CHOOSE.diagram.edit.parts.RolePerformedByEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorEditPart;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.part.Messages;

/**
 * @generated
 */
public class ChooseEditorNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ChooseEditorNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ChooseEditorNavigatorItem> result = new ArrayList<ChooseEditorNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof ChooseEditorNavigatorGroup) {
			ChooseEditorNavigatorGroup group = (ChooseEditorNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ChooseEditorNavigatorItem) {
			ChooseEditorNavigatorItem navigatorItem = (ChooseEditorNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {

		case OperationEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Operation_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Operation_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOperationalizedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOperationalizesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOutputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectInputForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectOutputOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ObjectAssociatesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectAssociates_4039_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectAssociates_4039_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerAccountableForEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerAccountableFor_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerAccountableFor_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerInformedForEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerInformedFor_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerInformedFor_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerPartOfEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerPartOf_4023_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerPartOf_4023_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HumanActorSupervisorsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActorSupervisors_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActorSupervisors_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalAndEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalAnd_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalAnd_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerControlsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerControls_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerControls_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationContainerInformEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerInform_4027_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerInform_4027_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectAssociatedEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectAssociated_4040_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectAssociated_4040_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalOperationalizedByEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalOperationalizedBy_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalOperationalizedBy_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalWishedByEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalWishedBy_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalWishedBy_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Goal_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Goal_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOrEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConflictedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConflictedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConflictsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConflictsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConcernsObjectsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOperationalizedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementSupergoalEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementSubgoalsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOperationalizesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectConcernsGoalsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case HumanActorSuperviseesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActorSupervisees_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActorSupervisees_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationContainerOutputEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerOutput_4032_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerOutput_4032_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ProjectEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Project_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Project_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOperationalizedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOperationalizesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOutputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectInputForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectOutputOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DeviceEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Device_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Device_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OperationContainerConsultEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerConsult_4026_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerConsult_4026_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationContainerOperationalizesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerOperationalizes_4031_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerOperationalizes_4031_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectInputForEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectInputFor_4036_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectInputFor_4036_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectPartOfEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectPartOf_4043_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectPartOf_4043_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerConsultedForEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerConsultedFor_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerConsultedFor_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RefinementSubgoalsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_RefinementSubgoals_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_RefinementSubgoals_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerWishesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerWishes_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerWishes_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RefinementSupergoalEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_RefinementSupergoal_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_RefinementSupergoal_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerMonitorsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerMonitors_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerMonitors_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectSpecializationEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectSpecialization_4041_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectSpecialization_4041_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalAssignedToEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalAssignedTo_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalAssignedTo_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SoftwareActorEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_SoftwareActor_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_SoftwareActor_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OperationContainerAccountableEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerAccountable_4028_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerAccountable_4028_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationContainerPartOfEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerPartOf_4029_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerPartOf_4029_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectConcernsGoalsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectConcernsGoals_4038_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectConcernsGoals_4038_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ProcessEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Process_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Process_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOperationalizedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOperationalizesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOutputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectInputForEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectOutputOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RolePerformedByEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_RolePerformedBy_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_RolePerformedBy_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalConcernsObjectsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalConcernsObjects_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalConcernsObjects_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Actor_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Actor_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActorContainerAssignmentsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerAssignments_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerAssignments_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalConflictedEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalConflicted_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalConflicted_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectSpecializedByEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectSpecializedBy_4042_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectSpecializedBy_4042_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalConflictsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalConflicts_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalConflicts_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectControlledByEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectControlledBy_4035_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectControlledBy_4035_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerResponsibleForEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerResponsibleFor_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerResponsibleFor_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectIncludesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectIncludes_4044_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectIncludes_4044_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ObjectOutputOfEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectOutputOf_4037_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectOutputOf_4037_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HumanActorEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActor_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActor_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorSupervisorsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorSupervisorsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorSuperviseesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorSuperviseesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RolePerformedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorPerformsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DiagramEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ChooseEditorNavigatorGroup Goals = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Goals,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Refinements = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Refinements,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Actors = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Actors,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup HumanActors = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_HumanActors,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Roles = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Roles,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Software = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Software,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Devices = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Devices,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Operations = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Operations,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Processes = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Processes,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Projects = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Projects,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup Objects = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_Objects,
					"icons/open.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup links = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			Goals.addChildren(createNavigatorItems(connectedViews, Goals, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementEditPart.VISUAL_ID));
			Refinements.addChildren(createNavigatorItems(connectedViews,
					Refinements, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			Actors.addChildren(createNavigatorItems(connectedViews, Actors,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			HumanActors.addChildren(createNavigatorItems(connectedViews,
					HumanActors, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			Roles.addChildren(createNavigatorItems(connectedViews, Roles, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			Software.addChildren(createNavigatorItems(connectedViews, Software,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			Devices.addChildren(createNavigatorItems(connectedViews, Devices,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			Operations.addChildren(createNavigatorItems(connectedViews,
					Operations, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			Processes.addChildren(createNavigatorItems(connectedViews,
					Processes, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			Projects.addChildren(createNavigatorItems(connectedViews, Projects,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			Objects.addChildren(createNavigatorItems(connectedViews, Objects,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOrEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAndEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConflictedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConflictsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConcernsObjectsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOperationalizedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementSupergoalEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementSubgoalsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorSupervisorsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorSuperviseesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RolePerformedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorPerformsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerPartOfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerIncludesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOperationalizesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOutputEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInputEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectConcernsGoalsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectInputForEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectOutputOfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectAssociatesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectAssociatedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectSpecializationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectSpecializedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectPartOfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectIncludesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!Goals.isEmpty()) {
				result.add(Goals);
			}
			if (!Refinements.isEmpty()) {
				result.add(Refinements);
			}
			if (!Actors.isEmpty()) {
				result.add(Actors);
			}
			if (!HumanActors.isEmpty()) {
				result.add(HumanActors);
			}
			if (!Roles.isEmpty()) {
				result.add(Roles);
			}
			if (!Software.isEmpty()) {
				result.add(Software);
			}
			if (!Devices.isEmpty()) {
				result.add(Devices);
			}
			if (!Operations.isEmpty()) {
				result.add(Operations);
			}
			if (!Processes.isEmpty()) {
				result.add(Processes);
			}
			if (!Projects.isEmpty()) {
				result.add(Projects);
			}
			if (!Objects.isEmpty()) {
				result.add(Objects);
			}
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case RoleEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Role_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Role_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAssignedToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalWishedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerWishesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerConsultedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerInformedForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAssignmentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RolePerformedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorPerformsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerAccountableForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerResponsibleForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerResponsibleEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInformEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerConsultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerAccountableEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ObjectEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Object_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Object_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalConcernsObjectsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerMonitorsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorContainerControlsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerOutputEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationContainerInputEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectConcernsGoalsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectMonitoredByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectInputForEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectOutputOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectControlledByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectAssociatesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectAssociatesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectAssociatedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectAssociatedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectSpecializationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectSpecializationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectSpecializedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectSpecializedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectPartOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectPartOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectIncludesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectIncludesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OperationContainerInputEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerInput_4033_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerInput_4033_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GoalOrEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalOr_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_GoalOr_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActorContainerIncludesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerIncludes_4024_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ActorContainerIncludes_4024_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationContainerResponsibleEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerResponsible_4025_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerResponsible_4025_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OperationContainerIncludesEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerIncludes_4030_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_OperationContainerIncludes_4030_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ProjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HumanActorPerformsEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActorPerforms_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_HumanActorPerforms_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RefinementEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			ChooseEditorNavigatorGroup incominglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Refinement_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup outgoinglinks = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_Refinement_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalOrEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(GoalAndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementSupergoalEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RefinementSubgoalsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ObjectMonitoredByEditPart.VISUAL_ID: {
			LinkedList<ChooseEditorAbstractNavigatorItem> result = new LinkedList<ChooseEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ChooseEditorNavigatorGroup target = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectMonitoredBy_4034_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ChooseEditorNavigatorGroup source = new ChooseEditorNavigatorGroup(
					Messages.NavigatorGroupName_ObjectMonitoredBy_4034_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(HumanActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(SoftwareActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ChooseEditorVisualIDRegistry
							.getType(ObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DiagramEditPart.MODEL_ID.equals(ChooseEditorVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ChooseEditorNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ChooseEditorNavigatorItem> result = new ArrayList<ChooseEditorNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ChooseEditorNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ChooseEditorNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ChooseEditorAbstractNavigatorItem) {
			ChooseEditorAbstractNavigatorItem abstractNavigatorItem = (ChooseEditorAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
