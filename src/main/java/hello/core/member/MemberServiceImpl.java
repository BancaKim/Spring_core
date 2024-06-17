package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;  //추상화에 의존 AppConfig 에서 주입

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
