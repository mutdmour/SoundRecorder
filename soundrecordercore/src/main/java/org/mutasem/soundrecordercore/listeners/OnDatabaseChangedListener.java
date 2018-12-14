package org.mutasem.soundrecordercore.listeners;

/**
 * @author mutasem dmour
 * Listen for add/rename items in database
 */
public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}