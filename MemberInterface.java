interface MemberManageInterface {
    void memberRegister(MemberList ml);

    void memberEdit(MemberList ml);

    String[] memberName();

    String[] memberAddress();

    static int idManagement(MemberList ml) {
        return idManagement(ml);
    };

    void DelayCheck(MemberList ml);
}
