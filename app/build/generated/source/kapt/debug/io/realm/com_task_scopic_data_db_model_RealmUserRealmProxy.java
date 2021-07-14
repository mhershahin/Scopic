package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_task_scopic_data_db_model_RealmUserRealmProxy extends com.task.scopic.data.db.model.RealmUser
    implements RealmObjectProxy, com_task_scopic_data_db_model_RealmUserRealmProxyInterface {

    static final class RealmUserColumnInfo extends ColumnInfo {
        long uIdColKey;
        long itemsColKey;

        RealmUserColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmUser");
            this.uIdColKey = addColumnDetails("uId", "uId", objectSchemaInfo);
            this.itemsColKey = addColumnDetails("items", "items", objectSchemaInfo);
        }

        RealmUserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmUserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmUserColumnInfo src = (RealmUserColumnInfo) rawSrc;
            final RealmUserColumnInfo dst = (RealmUserColumnInfo) rawDst;
            dst.uIdColKey = src.uIdColKey;
            dst.itemsColKey = src.itemsColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmUserColumnInfo columnInfo;
    private ProxyState<com.task.scopic.data.db.model.RealmUser> proxyState;
    private RealmList<com.task.scopic.data.db.model.RealmItem> itemsRealmList;

    com_task_scopic_data_db_model_RealmUserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmUserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.task.scopic.data.db.model.RealmUser>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$uId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.uIdColKey);
    }

    @Override
    public void realmSet$uId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uId' to null.");
            }
            row.getTable().setString(columnInfo.uIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'uId' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.uIdColKey, value);
    }

    @Override
    public RealmList<com.task.scopic.data.db.model.RealmItem> realmGet$items() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (itemsRealmList != null) {
            return itemsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.itemsColKey);
            itemsRealmList = new RealmList<com.task.scopic.data.db.model.RealmItem>(com.task.scopic.data.db.model.RealmItem.class, osList, proxyState.getRealm$realm());
            return itemsRealmList;
        }
    }

    @Override
    public void realmSet$items(RealmList<com.task.scopic.data.db.model.RealmItem> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("items")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.task.scopic.data.db.model.RealmItem> original = value;
                value = new RealmList<com.task.scopic.data.db.model.RealmItem>();
                for (com.task.scopic.data.db.model.RealmItem item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.itemsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.task.scopic.data.db.model.RealmItem linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.task.scopic.data.db.model.RealmItem linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmUser", false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "uId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "items", RealmFieldType.LIST, "RealmItem");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmUserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmUserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmUser";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmUser";
    }

    @SuppressWarnings("cast")
    public static com.task.scopic.data.db.model.RealmUser createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("items")) {
            excludeFields.add("items");
        }
        com.task.scopic.data.db.model.RealmUser obj = realm.createObjectInternal(com.task.scopic.data.db.model.RealmUser.class, true, excludeFields);

        final com_task_scopic_data_db_model_RealmUserRealmProxyInterface objProxy = (com_task_scopic_data_db_model_RealmUserRealmProxyInterface) obj;
        if (json.has("uId")) {
            if (json.isNull("uId")) {
                objProxy.realmSet$uId(null);
            } else {
                objProxy.realmSet$uId((String) json.getString("uId"));
            }
        }
        if (json.has("items")) {
            if (json.isNull("items")) {
                objProxy.realmSet$items(null);
            } else {
                objProxy.realmGet$items().clear();
                JSONArray array = json.getJSONArray("items");
                for (int i = 0; i < array.length(); i++) {
                    com.task.scopic.data.db.model.RealmItem item = com_task_scopic_data_db_model_RealmItemRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$items().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.task.scopic.data.db.model.RealmUser createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.task.scopic.data.db.model.RealmUser obj = new com.task.scopic.data.db.model.RealmUser();
        final com_task_scopic_data_db_model_RealmUserRealmProxyInterface objProxy = (com_task_scopic_data_db_model_RealmUserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("uId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$uId(null);
                }
            } else if (name.equals("items")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$items(null);
                } else {
                    objProxy.realmSet$items(new RealmList<com.task.scopic.data.db.model.RealmItem>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.task.scopic.data.db.model.RealmItem item = com_task_scopic_data_db_model_RealmItemRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$items().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_task_scopic_data_db_model_RealmUserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmUser.class), false, Collections.<String>emptyList());
        io.realm.com_task_scopic_data_db_model_RealmUserRealmProxy obj = new io.realm.com_task_scopic_data_db_model_RealmUserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.task.scopic.data.db.model.RealmUser copyOrUpdate(Realm realm, RealmUserColumnInfo columnInfo, com.task.scopic.data.db.model.RealmUser object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.task.scopic.data.db.model.RealmUser) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.task.scopic.data.db.model.RealmUser copy(Realm realm, RealmUserColumnInfo columnInfo, com.task.scopic.data.db.model.RealmUser newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.task.scopic.data.db.model.RealmUser) cachedRealmObject;
        }

        com_task_scopic_data_db_model_RealmUserRealmProxyInterface unmanagedSource = (com_task_scopic_data_db_model_RealmUserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.task.scopic.data.db.model.RealmUser.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.uIdColKey, unmanagedSource.realmGet$uId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_task_scopic_data_db_model_RealmUserRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.task.scopic.data.db.model.RealmItem> itemsUnmanagedList = unmanagedSource.realmGet$items();
        if (itemsUnmanagedList != null) {
            RealmList<com.task.scopic.data.db.model.RealmItem> itemsManagedList = managedCopy.realmGet$items();
            itemsManagedList.clear();
            for (int i = 0; i < itemsUnmanagedList.size(); i++) {
                com.task.scopic.data.db.model.RealmItem itemsUnmanagedItem = itemsUnmanagedList.get(i);
                com.task.scopic.data.db.model.RealmItem cacheitems = (com.task.scopic.data.db.model.RealmItem) cache.get(itemsUnmanagedItem);
                if (cacheitems != null) {
                    itemsManagedList.add(cacheitems);
                } else {
                    itemsManagedList.add(com_task_scopic_data_db_model_RealmItemRealmProxy.copyOrUpdate(realm, (com_task_scopic_data_db_model_RealmItemRealmProxy.RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmItem.class), itemsUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.task.scopic.data.db.model.RealmUser object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmUser.class);
        long tableNativePtr = table.getNativePtr();
        RealmUserColumnInfo columnInfo = (RealmUserColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmUser.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$uId = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$uId();
        if (realmGet$uId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uIdColKey, objKey, realmGet$uId, false);
        }

        RealmList<com.task.scopic.data.db.model.RealmItem> itemsList = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$items();
        if (itemsList != null) {
            OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
            for (com.task.scopic.data.db.model.RealmItem itemsItem : itemsList) {
                Long cacheItemIndexitems = cache.get(itemsItem);
                if (cacheItemIndexitems == null) {
                    cacheItemIndexitems = com_task_scopic_data_db_model_RealmItemRealmProxy.insert(realm, itemsItem, cache);
                }
                itemsOsList.addRow(cacheItemIndexitems);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmUser.class);
        long tableNativePtr = table.getNativePtr();
        RealmUserColumnInfo columnInfo = (RealmUserColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmUser.class);
        com.task.scopic.data.db.model.RealmUser object = null;
        while (objects.hasNext()) {
            object = (com.task.scopic.data.db.model.RealmUser) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$uId = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$uId();
            if (realmGet$uId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uIdColKey, objKey, realmGet$uId, false);
            }

            RealmList<com.task.scopic.data.db.model.RealmItem> itemsList = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$items();
            if (itemsList != null) {
                OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
                for (com.task.scopic.data.db.model.RealmItem itemsItem : itemsList) {
                    Long cacheItemIndexitems = cache.get(itemsItem);
                    if (cacheItemIndexitems == null) {
                        cacheItemIndexitems = com_task_scopic_data_db_model_RealmItemRealmProxy.insert(realm, itemsItem, cache);
                    }
                    itemsOsList.addRow(cacheItemIndexitems);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.task.scopic.data.db.model.RealmUser object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmUser.class);
        long tableNativePtr = table.getNativePtr();
        RealmUserColumnInfo columnInfo = (RealmUserColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmUser.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$uId = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$uId();
        if (realmGet$uId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.uIdColKey, objKey, realmGet$uId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.uIdColKey, objKey, false);
        }

        OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
        RealmList<com.task.scopic.data.db.model.RealmItem> itemsList = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$items();
        if (itemsList != null && itemsList.size() == itemsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = itemsList.size();
            for (int i = 0; i < objectCount; i++) {
                com.task.scopic.data.db.model.RealmItem itemsItem = itemsList.get(i);
                Long cacheItemIndexitems = cache.get(itemsItem);
                if (cacheItemIndexitems == null) {
                    cacheItemIndexitems = com_task_scopic_data_db_model_RealmItemRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                }
                itemsOsList.setRow(i, cacheItemIndexitems);
            }
        } else {
            itemsOsList.removeAll();
            if (itemsList != null) {
                for (com.task.scopic.data.db.model.RealmItem itemsItem : itemsList) {
                    Long cacheItemIndexitems = cache.get(itemsItem);
                    if (cacheItemIndexitems == null) {
                        cacheItemIndexitems = com_task_scopic_data_db_model_RealmItemRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                    }
                    itemsOsList.addRow(cacheItemIndexitems);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmUser.class);
        long tableNativePtr = table.getNativePtr();
        RealmUserColumnInfo columnInfo = (RealmUserColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmUser.class);
        com.task.scopic.data.db.model.RealmUser object = null;
        while (objects.hasNext()) {
            object = (com.task.scopic.data.db.model.RealmUser) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$uId = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$uId();
            if (realmGet$uId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.uIdColKey, objKey, realmGet$uId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.uIdColKey, objKey, false);
            }

            OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
            RealmList<com.task.scopic.data.db.model.RealmItem> itemsList = ((com_task_scopic_data_db_model_RealmUserRealmProxyInterface) object).realmGet$items();
            if (itemsList != null && itemsList.size() == itemsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = itemsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.task.scopic.data.db.model.RealmItem itemsItem = itemsList.get(i);
                    Long cacheItemIndexitems = cache.get(itemsItem);
                    if (cacheItemIndexitems == null) {
                        cacheItemIndexitems = com_task_scopic_data_db_model_RealmItemRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                    }
                    itemsOsList.setRow(i, cacheItemIndexitems);
                }
            } else {
                itemsOsList.removeAll();
                if (itemsList != null) {
                    for (com.task.scopic.data.db.model.RealmItem itemsItem : itemsList) {
                        Long cacheItemIndexitems = cache.get(itemsItem);
                        if (cacheItemIndexitems == null) {
                            cacheItemIndexitems = com_task_scopic_data_db_model_RealmItemRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                        }
                        itemsOsList.addRow(cacheItemIndexitems);
                    }
                }
            }

        }
    }

    public static com.task.scopic.data.db.model.RealmUser createDetachedCopy(com.task.scopic.data.db.model.RealmUser realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.task.scopic.data.db.model.RealmUser unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.task.scopic.data.db.model.RealmUser();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.task.scopic.data.db.model.RealmUser) cachedObject.object;
            }
            unmanagedObject = (com.task.scopic.data.db.model.RealmUser) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_task_scopic_data_db_model_RealmUserRealmProxyInterface unmanagedCopy = (com_task_scopic_data_db_model_RealmUserRealmProxyInterface) unmanagedObject;
        com_task_scopic_data_db_model_RealmUserRealmProxyInterface realmSource = (com_task_scopic_data_db_model_RealmUserRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$uId(realmSource.realmGet$uId());

        // Deep copy of items
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$items(null);
        } else {
            RealmList<com.task.scopic.data.db.model.RealmItem> manageditemsList = realmSource.realmGet$items();
            RealmList<com.task.scopic.data.db.model.RealmItem> unmanageditemsList = new RealmList<com.task.scopic.data.db.model.RealmItem>();
            unmanagedCopy.realmSet$items(unmanageditemsList);
            int nextDepth = currentDepth + 1;
            int size = manageditemsList.size();
            for (int i = 0; i < size; i++) {
                com.task.scopic.data.db.model.RealmItem item = com_task_scopic_data_db_model_RealmItemRealmProxy.createDetachedCopy(manageditemsList.get(i), nextDepth, maxDepth, cache);
                unmanageditemsList.add(item);
            }
        }

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmUser = proxy[");
        stringBuilder.append("{uId:");
        stringBuilder.append(realmGet$uId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{items:");
        stringBuilder.append("RealmList<RealmItem>[").append(realmGet$items().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_task_scopic_data_db_model_RealmUserRealmProxy aRealmUser = (com_task_scopic_data_db_model_RealmUserRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmUser.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmUser.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
