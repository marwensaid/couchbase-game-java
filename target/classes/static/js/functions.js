function search (doc, meta) {
    if(doc._class == "pl.altconnect.beans.Message" && doc.game) {
        emit(doc.game, null);
    }
}