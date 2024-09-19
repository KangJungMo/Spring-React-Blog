import { BoardListItem } from "types/interface";

const latestBoardListMock: BoardListItem[] = [
    {
        boardNumber: 1,
        title: "오늘 점심 뭐먹지",
        content: "오늘 점심을 뭐먹을지 너무 고민이 된다",
        boardTitleImage: 'data:image/png;base64,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',
        favoriteCount: 0,
        commentCount: 0,
        viewCount: 0,
        writeDatetime: "2023.08.18. 00:54:27",
        writeNickname: "안녕하세요",
        writeProfileImage: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxe0bM91aXx-mmhQfw-re2bVnSvM_lu7UVPg&usqp=CAU',
    },
    {
        boardNumber: 2,
        title: "오늘 점심 뭐먹지",
        content: "오늘 점심을 뭐먹을지 너무 고민이 된다",
        boardTitleImage: null,
        favoriteCount: 0,
        commentCount: 0,
        viewCount: 0,
        writeDatetime: "2023.08.18. 00:54:27",
        writeNickname: "안녕하세요",
        writeProfileImage: null,
    },
    {
        boardNumber: 3,
        title: "오늘 점심 뭐먹지",
        content: "오늘 점심을 뭐먹을지 너무 고민이 된다",
        boardTitleImage: null,
        favoriteCount: 0,
        commentCount: 0,
        viewCount: 0,
        writeDatetime: "2023.08.18. 00:54:27",
        writeNickname: "안녕하세요",
        writeProfileImage: null,
    }
];

export default latestBoardListMock;