package edu.stanford.bmir.protege.web.shared.bulkop;

import com.google.auto.value.AutoValue;
import com.google.common.annotations.GwtCompatible;
import edu.stanford.bmir.protege.web.shared.dispatch.Result;
import edu.stanford.bmir.protege.web.shared.event.EventList;
import edu.stanford.bmir.protege.web.shared.event.HasEventList;
import edu.stanford.bmir.protege.web.shared.event.ProjectEvent;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 25 Sep 2018
 */
@AutoValue
@GwtCompatible(serializable = true)
public abstract class MoveEntitiesToParentResult implements Result, HasEventList<ProjectEvent<?>> {

    public static MoveEntitiesToParentResult get(@Nonnull EventList<ProjectEvent<?>> eventList) {
        return new AutoValue_MoveEntitiesToParentResult(eventList);
    }

}
