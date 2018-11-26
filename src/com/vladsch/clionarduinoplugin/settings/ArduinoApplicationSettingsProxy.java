package com.vladsch.clionarduinoplugin.settings;

import org.jetbrains.annotations.NotNull;

public class ArduinoApplicationSettingsProxy implements ArduinoProjectFileSettings {
    public final static String[] EMPTY = new String[0];

    private final ArduinoApplicationSettings mySettings;
    private boolean myIsLibrary;
    private String[] myHeaders = EMPTY;
    private String[] mySources = EMPTY;
    private String mySketch = "";
    private String myProjectName = "";

    public ArduinoApplicationSettingsProxy(final ArduinoApplicationSettings settings, final boolean isLibrary) {
        myIsLibrary = isLibrary;
        mySettings = settings;
    }

    public ArduinoApplicationSettingsProxy(final boolean isLibrary) {
        this(new ArduinoApplicationSettings(), isLibrary);
    }

    public ArduinoApplicationSettingsProxy() {
        this(new ArduinoApplicationSettings(), false);
    }

    public boolean isLibrary() {
        return myIsLibrary;
    }

    public void setLibrary(final boolean library) {
        myIsLibrary = library;
    }

    @NotNull
    @Override
    public String[] getHeaders() {
        return myHeaders;
    }

    @NotNull
    @Override
    public String[] getSources() {
        return mySources;
    }

    @Override
    public @NotNull String getSketch() {
        return mySketch;
    }

    @Override
    public @NotNull String getProjectName() {
        return myProjectName;
    }

    public ArduinoApplicationSettings getApplicationSettings() {
        return mySettings;
    }

    @Override
    public void setHeaders(@NotNull final String[] headers) {
        myHeaders = headers;
    }

    @Override
    public void setSources(@NotNull final String[] sources) {
        mySources = sources;
    }

    @Override
    public void setSketch(@NotNull final String sketch) {
        mySketch = sketch;
    }

    @Override
    public void setProjectName(@NotNull final String projectName) {
        myProjectName = projectName;
    }

    @Override
    public @NotNull String getLanguageVersionId() {
        return mySettings.getLanguageVersionId();
    }

    @Override
    public @NotNull String getLibraryType() {
        return mySettings.getLibraryType();
    }

    @Override
    public String getLibraryDisplayName() {
        return mySettings.getLibraryDisplayName();
    }

    @NotNull
    @Override
    public String[] getLibraryDirectories() {
        return mySettings.getLibraryDirectories();
    }

    @Override
    public String[] getNestedLibraries() {
        return mySettings.getNestedLibraries();
    }

    @Override
    public boolean isAddLibraryDirectory() {
        return mySettings.isAddLibraryDirectory();
    }

    @Override
    public @NotNull String getBoardId() {
        return mySettings.getBoardId();
    }

    @Override
    public @NotNull String getCpuId() {
        return mySettings.getCpuId();
    }

    @Override
    public @NotNull String getProgrammerId() {
        return mySettings.getProgrammerId();
    }

    @Override
    public @NotNull String getPort() {
        return mySettings.getPort();
    }

    @Override
    public int getBaudRate() {
        return mySettings.getBaudRate();
    }

    @Override
    public boolean isVerbose() {
        return mySettings.isVerbose();
    }

    @Override
    public @NotNull String getLibraryCategory() {
        return mySettings.getLibraryCategory();
    }

    @Override
    public String getAuthorName() {
        return mySettings.getAuthorName();
    }

    @Override
    public @NotNull String getAuthorEMail() {
        return mySettings.getAuthorEMail();
    }

    @Override
    public void setLanguageVersionId(@NotNull final String languageVersionId) {
        mySettings.setLanguageVersion(languageVersionId);
    }

    @Override
    public void setLibraryType(@NotNull final String libraryType) {
        mySettings.setLibraryType(libraryType);
    }

    @Override
    public void setLibraryDisplayName(final String libraryDisplayName) {
        mySettings.setLibraryDisplayName(libraryDisplayName);
    }

    @Override
    public void setLibraryDirectories(final @NotNull String[] libraryDirectories) {
        mySettings.setLibraryDirectories(libraryDirectories);
    }

    @Override
    public void setNestedLibraries(final String[] nestedLibraries) {
        mySettings.setNestedLibraries(nestedLibraries);
    }

    @Override
    public void setAddLibraryDirectory(final boolean isAddLibraryDirectory) {
        mySettings.setAddLibraryDirectory(isAddLibraryDirectory);
    }

    @Override
    public void setBoardId(@NotNull final String boardId) {
        mySettings.setBoardId(boardId);
    }

    @Override
    public void setCpuId(@NotNull final String cpuId) {
        mySettings.setCpuId(cpuId);
    }

    @Override
    public void setProgrammerId(@NotNull final String programmerId) {
        mySettings.setProgrammerId(programmerId);
    }

    @Override
    public void setPort(@NotNull final String port) {
        mySettings.setPort(port);
    }

    @Override
    public void setBaudRate(final int baudRate) {
        mySettings.setBaudRate(baudRate);
    }

    @Override
    public void setVerbose(final boolean isVerbose) {
        mySettings.setVerbose(isVerbose);
    }

    @Override
    public void setLibraryCategory(@NotNull final String libraryCategory) {
        mySettings.setLibraryCategory(libraryCategory);
    }

    @Override
    public void setAuthorName(final String authorName) {
        mySettings.setAuthorName(authorName);
    }

    @Override
    public void setAuthorEMail(@NotNull final String authorEMail) {
        mySettings.setAuthorEMail(authorEMail);
    }

}